/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventarios.dao;

import com.inventario.inventarios.model.Venta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class VentaDao {
    private List<Venta> listaventas;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo="venta.dat";
    
    public VentaDao(){
    listaventas=new ArrayList <>();
    File file=new File(archivo);
        
        if(file.isFile()){
            try{
                this.entrada=new ObjectInputStream(new FileInputStream("venta.dat"));
                this.listaventas=(List<Venta>) entrada.readObject();
                this.entrada.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    guardar();
                }
    
        }
    }
    public boolean crear(Venta venta) {
        listaventas.add(venta);
        guardar();
        return true;
    }

    public List<Venta> mostrarTodos() {
        return listaventas;
    }

    private void guardar() {
        try{
            this.salida=new ObjectOutputStream(new FileOutputStream("venta.dat"));
            this.salida.writeObject(listaventas);
            this.salida.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
