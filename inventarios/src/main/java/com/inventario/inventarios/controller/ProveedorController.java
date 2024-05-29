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
        this.vista.cambiarProveedor.addActionListener(this);
        this.vista.buscarProveedor.addActionListener(this);
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
            }
        }
        if (e.getSource().equals(this.vista.buscarProveedor)){
            int id=Integer.valueOf(this.vista.idProveedor.getText());
            proveedor=modelo.buscar(id);
            
            if (proveedor==null){
                //joptionpane
            }else{
                vista.nombreProveedor.setText(proveedor.getNombre());
                vista.telefonoProveedor.setText(String.valueOf(proveedor.getTelefono()));
            }
        }
        if(e.getSource().equals(this.vista.cambiarProveedor)){
            int index=modelo.Index(proveedor);
            if(index==-1){
                
            }else{
                proveedor=new Proveedor();
                proveedor.setId(Integer.valueOf(this.vista.idProveedor.getText()));
                proveedor.setNombre(this.vista.nombreProveedor.getText());
                proveedor.setTelefono(Integer.valueOf(this.vista.telefonoProveedor.getText()));
                modelo.cambiar(index, proveedor);
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
