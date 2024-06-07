package com.inventario.inventarios.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.inventario.inventarios.view.VistaCliente;
import com.inventario.inventarios.view.VistaPrincipal;
import com.inventario.inventarios.view.vistaProveedor;

public class MainController implements ActionListener {

    private VistaPrincipal vista;

    public MainController(VistaPrincipal vista) {
        this.vista = vista;
        this.vista.btnMenuCliente.addActionListener(this);
        this.vista.btnMenuProveedor.addActionListener(this);
        this.vista.btnMenuProductos.addActionListener(this);
        this.vista.btnMenuCompra.addActionListener(this);
        this.vista.btnMenuVenta.addActionListener(this);

        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.btnMenuCliente)) {
            ClienteController cCliente = new ClienteController(new VistaCliente());
        }
        if (e.getSource().equals(this.vista.btnMenuProveedor)) {
            ProveedorController cProveedor = new ProveedorController(new vistaProveedor());
        }
        if (e.getSource().equals(this.vista.btnMenuProductos)) {
            // Aqui se pone el controlador de cada vista, con su respectiva vista
        }
        if (e.getSource().equals(this.vista.btnMenuVenta)) {

        }
        if (e.getSource().equals(this.vista.btnMenuCompra)) {

        }

    }

}
