package com.inventario.inventarios.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.inventario.inventarios.dao.ClienteDao;
import com.inventario.inventarios.model.Cliente;
import com.inventario.inventarios.view.VistaCliente;

public class ClienteController implements ActionListener{
    private VistaCliente vista;
    private ClienteDao clienteDao;
    private Cliente cliente;

    public ClienteController(VistaCliente vista) {
        this.vista = vista;
        this.clienteDao = new ClienteDao();
        this.vista.setVisible(true);
        this.vista.btnCrearCliente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource().equals(this.vista.btnCrearCliente)){
        System.out.println("alv");
     }
      
    }

    
}
