package com.inventario.inventarios.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.inventario.inventarios.dao.ProductoDao;
import com.inventario.inventarios.model.Producto;
import com.inventario.inventarios.view.vistaProducto;

public class ProductoController implements ActionListener {
    private vistaProducto vista;
    private ProductoDao productoDao;
    private DefaultTableModel tablaModelo;

    public ProductoController(vistaProducto vista) {
        this.vista = vista;
        this.productoDao = new ProductoDao();
        this.vista.btonBuscarProducto.addActionListener(this);
        this.vista.btonBuscarTodoProducto.addActionListener(this);
        this.vista.btonCrearProducto.addActionListener(this);
        this.vista.btonModificarProducto.addActionListener(this);
        this.vista.btonBorrarProducto.addActionListener(this);
        this.tablaModelo = (DefaultTableModel) this.vista.tablaProducto.getModel();
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.btonBuscarProducto)) {
            buscarProductoPorId();
        } else if (e.getSource().equals(this.vista.btonBuscarTodoProducto)) {
            mostrarTodosLosProductos();
        } else if (e.getSource().equals(this.vista.btonCrearProducto)) {
            crearProducto();
        } else if (e.getSource().equals(this.vista.btonModificarProducto)) {
            modificarProducto();
        } else if (e.getSource().equals(this.vista.btonBorrarProducto)) {
            borrarProducto();
        }
    }

    private void buscarProductoPorId() {
        try {
            int id = Integer.parseInt(this.vista.txtCodigoProducto.getText());
            Producto producto = productoDao.buscar(id);
            if (producto != null) {
                this.vista.txtNombreProducto.setText(producto.getNombre());
                this.vista.txtDescripcionProducto.setText(producto.getDescripcion());
                this.vista.txtStockProducto.setText(String.valueOf(producto.getStock()));

            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarTodosLosProductos() {
        limpiarTabla();
        for (Producto producto : productoDao.consultarTodos()) {
            Object[] fila = {producto.getCodigo(), producto.getNombre(), producto.getDescripcion(), producto.getStock()};
            tablaModelo.addRow(fila);
        }
    }

    private void crearProducto() {
        try {
            Producto producto = new Producto();
            if(productoDao.consultarTodos().size()<1){
                producto.setCodigo(1000);
            }else{
                producto.setCodigo(productoDao.consultarTodos().getLast().getCodigo() + 1);
            }
            producto.setNombre(this.vista.txtNombreProducto.getText());
            producto.setDescripcion(this.vista.txtDescripcionProducto.getText());
            producto.setStock(Integer.parseInt(this.vista.txtStockProducto.getText()));

            if (productoDao.crear(producto)) {
                JOptionPane.showMessageDialog(null, "Producto creado exitosamente");
                mostrarTodosLosProductos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear producto");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para Stock", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarTabla() {
        int filas = tablaModelo.getRowCount();
        for (int i = filas - 1; i >= 0; i--) {
            tablaModelo.removeRow(i);
        }
    }

    private void modificarProducto() {
        try {
            int id = Integer.parseInt(this.vista.txtCodigoProducto.getText());
            Producto productoExistente = productoDao.buscar(id);
            if (productoExistente != null) {
                productoExistente.setNombre(this.vista.txtNombreProducto.getText());
                productoExistente.setDescripcion(this.vista.txtDescripcionProducto.getText());
                productoExistente.setStock(Integer.parseInt(this.vista.txtStockProducto.getText()));

                if (productoDao.modificar(id, productoExistente)) {
                    JOptionPane.showMessageDialog(null, "Producto actualizado exitosamente");
                    mostrarTodosLosProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar producto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor numérico para Stock", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarProducto() {
        try {
            int id = Integer.parseInt(this.vista.txtCodigoProducto.getText());
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Confirma borrar el producto con ID " + id + "?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                if (productoDao.borrar(id)) {
                    JOptionPane.showMessageDialog(null, "Producto borrado con éxito");
                    mostrarTodosLosProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al borrar producto");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
