/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventarios.controller;


import com.inventario.inventarios.dao.ProveedorDao;
import com.inventario.inventarios.model.Proveedor;
import com.inventario.inventarios.view.vistaProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Labing-PC
 */
public class ProveedorController implements ActionListener{
    private vistaProveedor vista;
    private ProveedorDao modelo;
    private Proveedor proveedor;
    private DefaultTableModel modeloP;
    
    public ProveedorController(vistaProveedor vista){
        this.vista=vista;
        this.modelo=new ProveedorDao();
        this.vista.crearProveedor.addActionListener(this);
        this.vista.borrarProveedor.addActionListener(this);
        this.vista.mostrarpasajeros.addActionListener(this);
        this.modeloP=(DefaultTableModel) this.vista.tablaproveedores.getModel();
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.crearProveedor)){
            proveedor=new Proveedor();
            proveedor.setId(Integer.valueOf(this.vista.idProveedor.getText()));
            proveedor.setNombre(this.vista.nombreProveedor.getText());
            proveedor.setTelefono(Integer.valueOf(this.vista.telefonoProveedor.getText()));
            
            if(modelo.crear(proveedor)){
                //joptionpane
                JOptionPane.showMessageDialog(null, "NUEVO PROVEEDOR CREADO");
            }
        }
        
        if (e.getSource().equals(this.vista.borrarProveedor)) {
            int id = Integer.parseInt(this.vista.idProveedor.getText());
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea borrar el proveedor con ID " + id + "?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                Proveedor proveedorBorrar = null;
                for (Proveedor p : modelo.mostrartodos()) {
                    if (p.getId() == id) {
                        proveedorBorrar = p;
                        break;
                    }
                }

                if (proveedorBorrar != null) {
                    modelo.borrar(proveedorBorrar);
                    JOptionPane.showMessageDialog(null, "Proveedor borrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Proveedor con ID " + id + " no encontrado");
                }
            }
        }
        
        if(e.getSource().equals(this.vista.mostrarpasajeros)){
            List<Proveedor> listaP= modelo.mostrartodos();
            int filas=modeloP.getRowCount();
            
            for (int i=0; i<filas;i++){
                modeloP.removeRow(0);
            }
            
            for (Proveedor proveedor: listaP){
                Object[]array={proveedor.getId(),proveedor.getNombre(),proveedor.getTelefono()};
                modeloP.addRow(array);
            }
         }
    }
}
