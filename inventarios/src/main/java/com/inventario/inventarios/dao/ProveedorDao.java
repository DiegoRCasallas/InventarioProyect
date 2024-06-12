/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventarios.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.inventario.inventarios.model.Proveedor;

/**
 *
 * @author Labing-PC
 */
public class ProveedorDao {
    private List<Proveedor> listaproveedores;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private String archivo="proveedor.dat";
    
    public ProveedorDao(){
        listaproveedores=new ArrayList<>();
        
        File file=new File(archivo);
        
        if(file.isFile()){
            try{
                this.entrada=new ObjectInputStream(new FileInputStream("proveedor.dat"));
                this.listaproveedores=(List<Proveedor>) entrada.readObject();
                this.entrada.close();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    guardar();
            }
        }
    }
    
    public boolean crear(Proveedor proveedor){
        listaproveedores.add(proveedor);
        guardar();
        return true;
    }
    
    public void borrar(Proveedor proveedor){
        listaproveedores.remove(proveedor);
        guardar();
    }

    private void guardar() {
        try{
            this.salida=new ObjectOutputStream(new FileOutputStream("proveedor.dat"));
            this.salida.writeObject(listaproveedores);
            this.salida.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Proveedor> mostrartodos(){
        return listaproveedores;
    }

    public Proveedor buscar(int codigo) {
        for (Proveedor proveedor : listaproveedores) {
            if (proveedor.getId() == codigo) {
                return proveedor;
            }
        }
        return null; 
    }
}
