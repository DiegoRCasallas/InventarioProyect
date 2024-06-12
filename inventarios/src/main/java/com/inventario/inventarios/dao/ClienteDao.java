package com.inventario.inventarios.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.inventario.inventarios.model.Cliente;


public class ClienteDao {
    private List<Cliente> listaClientes;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo="clientes.dat";

    public ClienteDao(){
        listaClientes=new ArrayList<>();
        
        File file=new File(archivo);
        
       
        if(file.isFile()){
            try{
                this.entrada=new ObjectInputStream(new FileInputStream("clientes.dat"));
                this.listaClientes=(List<Cliente>) entrada.readObject();
                this.entrada.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    guardar();
            }
        }
    }
    
    public boolean crear(Cliente cliente){
        listaClientes.add(cliente);
        guardar();
        return true;
    }
    
    public Cliente buscar(int id) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    private void guardar() {
        try{
            this.salida=new ObjectOutputStream(new FileOutputStream("clientes.dat"));
            this.salida.writeObject(listaClientes);
            this.salida.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void borrar(Cliente cliente){
        listaClientes.remove(cliente);
        guardar();
    }

    
    public List<Cliente> mostrarTodos(){
        return listaClientes;
    }
}
