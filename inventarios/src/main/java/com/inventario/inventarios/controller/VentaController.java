/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventarios.controller;

import com.inventario.inventarios.dao.ClienteDao;
import com.inventario.inventarios.dao.ProductoDao;
import com.inventario.inventarios.dao.VentaDao;
import com.inventario.inventarios.model.Cliente;
import com.inventario.inventarios.model.Producto;
import com.inventario.inventarios.model.Venta;
import com.inventario.inventarios.view.vistaInformeVenta;
import com.inventario.inventarios.view.vistaVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camilo
 */
public class VentaController implements ActionListener{
    private ProductoDao productos;
    private ClienteDao clientes;
    private vistaVenta vista;
    private vistaInformeVenta vistainforme;
    private VentaDao modelo;
    private Venta venta;
    private DefaultTableModel modeloV;
    
    public VentaController(vistaVenta vista){
        this.productos=new ProductoDao();
        this.clientes=new ClienteDao();
        this.vista=vista;
        this.vistainforme=new vistaInformeVenta();
        this.modelo=new VentaDao();
        this.vista.buscarelcliente.addActionListener(this);
        this.vista.buscarelproducto.addActionListener(this);
        this.vista.vender.addActionListener(this);
        this.vista.mostrarventas.addActionListener(this);
        this.vistainforme.confirmarventa.addActionListener(this);
        this.modeloV=(DefaultTableModel) this.vista.tablaventa.getModel();
        this.vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.buscarelcliente) {
            int idCliente = Integer.parseInt(vista.iddelcliente.getText());
            Cliente cliente = clientes.buscar(idCliente);
            if (cliente != null) {
                vista.nombredelcliente.setText(cliente.getNombre());
            } else {
                JOptionPane.showMessageDialog(vista, "Cliente no encontrado");
            }
        }
        
        if (e.getSource() == vista.buscarelproducto) {
            int idProducto = Integer.parseInt(vista.iddelproducto.getText());
            Producto producto = productos.buscar(idProducto);
            if (producto != null) {
                vista.nombredelproducto.setText(producto.getNombre());
                vista.descripciondelproducto.setText(producto.getDescripcion());
                vista.inventario.setText(String.valueOf(producto.getStock()));
                vista.totaldelaventa.setText(String.valueOf(producto.getTotal()));
            } else {
                JOptionPane.showMessageDialog(vista, "Producto no encontrado");
            }
        }
        
        if (e.getSource() == vista.vender) {
            if (vista.nombredelcliente.getText().isEmpty() || vista.nombredelproducto.getText().isEmpty() || 
            vista.descripciondelproducto.getText().isEmpty() || vista.inventario.getText().isEmpty() ||
            vista.cantidadapedir.getText().isEmpty()) {
            
                JOptionPane.showMessageDialog(vista, "Faltan campos por llenar");
                return;
            }
        
            int idCliente = Integer.parseInt(vista.iddelcliente.getText());
            String nombreCliente = vista.nombredelcliente.getText();
            int idProducto = Integer.parseInt(vista.iddelproducto.getText());
            String nombreProducto = vista.nombredelproducto.getText();
            String descripcionProducto = vista.descripciondelproducto.getText();
            int stock = Integer.parseInt(vista.inventario.getText());
            int cantidad = Integer.parseInt(vista.cantidadapedir.getText());
            double total = Double.parseDouble(vista.totaldelaventa.getText());
            double subtotal = Double.parseDouble(vista.subtotaldelproducto.getText());
            double iva = Double.parseDouble(vista.ivadelproducto.getText());
        
            if (cantidad > stock) {
                JOptionPane.showMessageDialog(vista, "La cantidad solicitada supera el stock disponible");
                return;
            }
        
            Producto producto = productos.buscar(idProducto);
            producto.setStock(stock - cantidad);
            productos.modificar(idProducto, producto);
        
            Venta venta = new Venta();
            venta.setIdcliente(idCliente);
            venta.setNombrecliente(nombreCliente);
            venta.setIdproducto(idProducto);
            venta.setNombreproducto(nombreProducto);
            venta.setDescripcionproducto(descripcionProducto);
            venta.setStock(cantidad);
            venta.setSubtotal(subtotal);
            venta.setIva(iva);
            venta.setTotal(total);
            venta.setFecha(LocalDate.now());
            venta.setFacturaventa(modelo.mostrarTodos().size() + 1); 
        
            modelo.crear(venta);
        
            // Mostrar vista de informe de venta
            vistainforme.clientefactura.setText(nombreCliente);
            vistainforme.facturaventa.setText(String.valueOf(venta.getFacturaventa()));
            vistainforme.fechaventa.setText(venta.getFecha().toString());
            vistainforme.idfactura.setText(String.valueOf(idProducto));
            vistainforme.nombreproductofactura.setText(nombreProducto);
            vistainforme.descripcionfactura.setText(descripcionProducto);
            vistainforme.totalfactura.setText(String.valueOf(total));
        
            vistainforme.setVisible(true);
            }
        
        if (e.getSource() == vista.mostrarventas) {
            List<Venta> listaV= modelo.mostrarTodos();
            int filas=modeloV.getRowCount();
            
            for (int i=0; i<filas;i++){
                modeloV.removeRow(0);
            }
            
            for (Venta venta: listaV){
                Object[]array={venta.getFacturaventa(),venta.getNombrecliente(),venta.getIdproducto(),venta.getNombreproducto(),venta.getStock(),venta.getIva(),venta.getTotal()};
                modeloV.addRow(array);
            }
        }
        
        if (e.getSource() == vistainforme.confirmarventa) {
            JOptionPane.showMessageDialog(vistainforme, "Venta confirmada y producto eliminado del stock");
            vistainforme.setVisible(false);
            limpiarCampos();
        }
    }
    
    private void limpiarCampos() {
        vista.iddelcliente.setText("");
        vista.nombredelcliente.setText("");
        vista.iddelproducto.setText("");
        vista.nombredelproducto.setText("");
        vista.descripciondelproducto.setText("");
        vista.inventario.setText("");
        vista.cantidadapedir.setText("");
        vista.totaldelaventa.setText("");
        vista.subtotaldelproducto.setText("");
        vista.ivadelproducto.setText("");
    }
}
    
