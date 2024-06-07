package com.inventario.inventarios.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.inventario.inventarios.dao.ClienteDao;
import com.inventario.inventarios.model.Cliente;
import com.inventario.inventarios.model.Proveedor;
import com.inventario.inventarios.view.VistaCliente;

public class ClienteController implements ActionListener {
    private VistaCliente vista;
    private ClienteDao clienteDao;
    private Cliente cliente;
    private DefaultTableModel tablaModelo;

    public ClienteController(VistaCliente vista) {
        this.vista = vista;
        this.clienteDao = new ClienteDao();
        this.vista.btnCrearCliente.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnMostrar.addActionListener(this);
        this.tablaModelo = (DefaultTableModel) this.vista.tablaClientes.getModel();
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.vista.btnCrearCliente)) {
            cliente = new Cliente();
            //Esto es para hacer un id automatico en cada cliente que se crea, lineas 35 a 39
            if(clienteDao.mostrarTodos().size()<1){
                cliente.setId(1);
            }else{
                cliente.setId(clienteDao.mostrarTodos().getLast().getId() + 1);
            }
            cliente.setNombre(this.vista.txtNombreCrearCliente.getText());
            cliente.setTelefono(this.vista.txtTelefonoCrearCliente.getText());
            if (clienteDao.crear(cliente)) {
                JOptionPane.showMessageDialog(null, "UN NUEVO CLIENTE 🍌 FUE CREADO");
            }
        }
        if (e.getSource().equals(this.vista.btnMostrar)) {
            System.out.println("Mostrar clientes");

            List<Cliente> clientesLista = clienteDao.mostrarTodos();
            int filas = tablaModelo.getRowCount();

            for (int i = 0; i < filas; i++) {
                tablaModelo.removeRow(0);
            }

            for (Cliente cliente : clientesLista) {
                Object[] array = { cliente.getId(), cliente.getNombre(),
                        cliente.getTelefono() };
                tablaModelo.addRow(array);
            }

        }
        if (e.getSource().equals(this.vista.btnEliminar)) {
            System.out.println("Cliente eliminado");
            int id = Integer.parseInt(this.vista.txtID.getText());
            int respuesta = JOptionPane.showConfirmDialog(null, "¿confirma borrar el proveedor con ID " + id + "?", "Confirmación", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                Cliente clienteBorrar = null;
                for (Cliente cliente : clienteDao.mostrarTodos()) {
                    if (cliente.getId() == id) {
                        clienteBorrar = cliente;
                        break;
                    }
                }

                if (clienteBorrar != null) {
                    clienteDao.borrar(clienteBorrar);
                    JOptionPane.showMessageDialog(null, "cliente borrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "cliente con ID " + id + " no encontrado");
                }
            }
        }
    }
}