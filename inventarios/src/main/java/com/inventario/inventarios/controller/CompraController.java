package com.inventario.inventarios.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
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

public class CompraController implements ActionListener {
    private vistaCompra vista;
    private CompraDao compraDao;
    private DefaultTableModel tablaModelo;
    private ProductoDao productoDao;
    private ProveedorDao proveedorDao;
    private List<Compra> detallesCompra;

    public CompraController(vistaCompra vista) {
        this.vista = vista;
        this.compraDao = new CompraDao();
        this.productoDao = new ProductoDao();  
        this.proveedorDao = new ProveedorDao();  
        this.detallesCompra = new ArrayList<>();

        this.vista.btonBuscarProductoCompra.addActionListener(this);
        this.vista.btonBuscarProveedorCompra.addActionListener(this);
        this.vista.btonAgregarCompra.addActionListener(this);
        this.vista.btonBuscarTodoCompra.addActionListener(this);
        this.tablaModelo = (DefaultTableModel) this.vista.tablaCompra.getModel();

        this.vista.addWindowListener(new WindowAdapter() {
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
        } else if (e.getSource().equals(this.vista.btonAgregarCompra)) {
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
        List<Proveedor> proveedores = proveedorDao.mostrartodos();

        if (!productos.isEmpty() && !proveedores.isEmpty() && productos.size() == proveedores.size()) {
            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
                Proveedor proveedor = proveedores.get(i);

                Object[] fila = {producto.getCodigo(), producto.getNombre(), producto.getDescripcion(), producto.getStock(), producto.getTotal(), proveedor.getNombre()};
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
        try {
            int codigoProducto = Integer.parseInt(this.vista.txtCodigoProductoCompra.getText());
            int cantidad = Integer.parseInt(this.vista.txtCantidadCompra.getText());
            int id = Integer.parseInt(this.vista.txtCodigoProductoCompra.getText());
            String nombreProveedor = this.vista.txtNombreProveedorCompra.getText();
    
            
            
            Producto productoSeleccionado = productoDao.buscar(codigoProducto);
    
            if (productoSeleccionado == null) {
                JOptionPane.showMessageDialog(null, "El producto o proveedor no existe.");
                return false;
            }
    
            if (cantidad > productoSeleccionado.getStock()) {
                JOptionPane.showMessageDialog(null, "No hay suficiente stock disponible para este producto.");
                return false;
            }
    
            double subtotalProducto = productoSeleccionado.getTotal() * cantidad;
            double ivaProducto = subtotalProducto * 0.19;
            double totalProducto = subtotalProducto + ivaProducto;
            
           
    
            this.vista.txtIvaCompra.setText(String.valueOf(ivaProducto));
            this.vista.txtTotalCompra.setText(String.valueOf(totalProducto));
            Compra detalle = new Compra(productoSeleccionado, nombreProveedor, cantidad, subtotalProducto, ivaProducto, totalProducto);
            detallesCompra.add(detalle);
    
            
            if(compraDao.mostrarTodos().size()<1){
                int Factura = 1;
            }else{
                detalle.setFactura(compraDao.mostrarTodos().getLast().getFactura() + 1);
            }
    

            productoSeleccionado.setStock(productoSeleccionado.getStock() - cantidad);
            productoDao.modificar(id, productoSeleccionado);
    
    
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
}
