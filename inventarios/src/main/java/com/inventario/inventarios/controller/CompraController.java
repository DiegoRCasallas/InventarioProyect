package com.inventario.inventarios.controller;
/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.inventario.inventarios.dao.CompraDao;
import com.inventario.inventarios.model.Compra;
import com.inventario.inventarios.view.vistaCompra;

public class CompraController implements ActionListener {
    private  vistaCompra view;
    private CompraDao modelo;
    private DefaultTableModel modeloT;

public void ControlConsultaTodos(vistaCompra view){
        this.view = view;
        this.modelo =new CompraDao();
        this.view.btonBuscarProductoCompra.addActionListener(this);
        
        this.modeloT = (DefaultTableModel) this.view.tablaCompra.getModel();
        this.view.setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource().equals(this.view.tablaCompra)){
           List<Compra> listaP = modelo.CompraDao();
           int filas = modeloT.getRowCount();
           
           for (int i = 0; i < filas; i++) {
             modeloT.removeRow(0);
           }
            
           for (Pasajero pasajero : listaP) {
                Object[] array = {pasajero.getId(),pasajero.getNombre(),pasajero.getEdad()};
                modeloT.addRow(array);
           }
           
         
         }
    }

}
 */