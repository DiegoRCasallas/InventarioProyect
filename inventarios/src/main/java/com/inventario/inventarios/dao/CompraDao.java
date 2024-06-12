package com.inventario.inventarios.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.inventario.inventarios.model.Compra;

public class CompraDao {
    private List<Compra> listaCompra;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo="compra.dat";
    

    public CompraDao() {
        listaCompra=new ArrayList<>();
            
            File file=new File(archivo);
            
           
            if(file.isFile()){
                try{
                    this.entrada=new ObjectInputStream(new FileInputStream("compra.dat"));
                    this.listaCompra=(List<Compra>) entrada.readObject();
                    this.entrada.close();
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                        guardar();
                }
            }
        }
            public boolean crear(Compra compra){
        listaCompra.add(compra);
        guardar();
        return true;
    }
    
    private void guardar() {
        try{
            this.salida=new ObjectOutputStream(new FileOutputStream("compra.dat"));
            this.salida.writeObject(listaCompra);
            this.salida.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
 
    
    public List<Compra> mostrarTodos(){
        return listaCompra;
    }
}



