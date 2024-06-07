package com.inventario.inventarios.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.inventario.inventarios.model.Cliente;
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
    
    public boolean crear(Cliente Cliente){
        listaClientes.add(Cliente);
        guardar();
        return true;
    }
    
    private void guardar() {
        try{
            this.salida=new ObjectOutputStream(new FileOutputStream("Cliente.dat"));
            this.salida.writeObject(listaClientes);
            this.salida.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Cliente> mostrartodos(){
        return listaClientes;
    }
}
