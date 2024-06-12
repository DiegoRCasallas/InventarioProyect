package com.inventario.inventarios.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.inventario.inventarios.dao.CompraDao;
import com.inventario.inventarios.dao.ProductoDao;
import com.inventario.inventarios.dao.ProveedorDao;
import com.inventario.inventarios.model.Compra;
import com.inventario.inventarios.model.Producto;
import com.inventario.inventarios.model.Proveedor;
import com.inventario.inventarios.view.vistaCompra;

public class CompraController implements ActionListener{
    private vistaCompra vista;
    private CompraDao compraDao;
    private Compra compra;
    private DefaultTableModel tablaModelo;
    private ProductoDao productoDao;
    private ProveedorDao proveedorDao;

    public CompraController(vistaCompra vista){
        this.vista = vista;
        this.compraDao = new CompraDao();
        this.vista.btonBuscarProductoCompra.addActionListener(this);
        this.vista.btonBuscarProveedorCompra.addActionListener(this);
        this.vista.btonAgregarCompra.addActionListener(this);
        this.vista.btonBuscarTodoCompra.addActionListener(this);
        this.tablaModelo = (DefaultTableModel) this.vista.tablaCompra.getModel();
        this.vista.addWindowListener((WindowListener) new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                vista.dispose(); 
            }
        });
        this.vista.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.vista.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.btonBuscarProductoCompra)) {
            buscarProductoPorId();
        } else if (e.getSource().equals(this.vista.btonBuscarProveedorCompra)) {
            buscarProveedorPorId();
        } else if (e.getSource().equals(this.vista.btonBuscarTodoCompra)) {
            mostrarTodosCompra();
        }else if (e.getSource().equals(this.vista.btonAgregarCompra)){
            agregarCompra();
        } 
    }

     public void buscarProductoPorId() {
        try {
            int id = Integer.parseInt(this.vista.txtCodigoProductoCompra.getText());
            Producto producto = productoDao.buscar(id);
            if (producto != null) {
                this.vista.txtNombreProductoCompra.setText(producto.getNombre());
                this.vista.txtDescripcionProductoCompra.setText(producto.getDescripcion());
                this.vista.txtStockProductoCompra.setText(String.valueOf(producto.getStock()));
                this.vista.txtSubtotalCompra.setText(String.valueOf(producto.getTotal()));
                
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscarProveedorPorId() {
        try {
            int id = Integer.parseInt(this.vista.txtIdProveedorCompra.getText());
            Proveedor proveedor = proveedorDao.buscar(id);
            if (proveedor != null) {
                this.vista.txtNombreProveedorCompra.setText(proveedor.getNombre());
            } else {
                JOptionPane.showMessageDialog(null, "Proveedor no encontrado");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarTodosCompra() {
    limpiarTabla();
    List<Producto> productos = productoDao.consultarTodos();
    List<Proveedor> proveedor = proveedorDao.mostrartodos();
    
    if (!productos.isEmpty() && !proveedor.isEmpty() && productos.size() == proveedor.size()) {
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            Proveedor proveedores = proveedor.get(i);
            
            Object[] fila = {producto.getCodigo(), producto.getNombre(), producto.getDescripcion(), producto.getStock(), producto.getTotal(), proveedores.getNombre()};
            tablaModelo.addRow(fila);
        }
    }
}


    public void limpiarTabla() {
        int filas = tablaModelo.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            tablaModelo.removeRow(i);
        }
    }
    
    public boolean agregarCompra() {

        int codigoProducto = Integer.parseInt(this.vista.txtCodigoProductoCompra.getText());
        int cantidad = Integer.parseInt(this.vista.txtCantidadCompra.getText());
    
        Producto productoSeleccionado = null;
        for (Producto producto : productoDao.consultarTodos()) {
            if (producto.getCodigo() == codigoProducto) {
                productoSeleccionado = producto;
                break;
            }
        }
    
        if (productoSeleccionado == null) {
            JOptionPane.showMessageDialog(null, "El producto no existe.");
            return false;
        }
    
        if (cantidad > productoSeleccionado.getStock()) {
            JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible para este producto.");
            return false;
        }
    
        double subtotalProducto = productoSeleccionado.getTotal() * cantidad;
        double ivaProducto = subtotalProducto * 0.19;
        double totalProducto = subtotalProducto + ivaProducto;
    
        productoSeleccionado.setSubtotalCompra(subtotalProducto);
        productoSeleccionado.setIvaCompra(ivaProducto);
        productoSeleccionado.setTotalCompra(totalProducto);
    
        productoSeleccionado.setStock(productoSeleccionado.getStock() - cantidad);

    
        return true; 
    }
    
        
}
