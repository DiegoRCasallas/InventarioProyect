package com.inventario.inventarios.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.inventario.inventarios.model.Producto;

public class ProductoDao {
    private List<Producto> listaProductos;
    private String archivo = "productos.dat";

    public ProductoDao() {
        listaProductos = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        File file = new File(archivo);

        if (file.isFile()) {
            try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
                listaProductos = (List<Producto>) entrada.readObject();
            } catch (Exception e) {
                System.out.println("Error al cargar datos: " + e.getMessage());
            }
        }
    }

    public boolean crear(Producto producto) {
        if (buscar(producto.getCodigo()) == null) {
            listaProductos.add(producto);
            guardar();
            return true;
        }
        return false; 
    }

    public Producto buscar(int codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null; 
    }

    public boolean modificar(int codigo, Producto productoModificado) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = listaProductos.get(i);
            if (producto.getCodigo() == codigo) {
                listaProductos.set(i, productoModificado);
                guardar();
                return true; 
            }
        }
        return false; 
    }

    public boolean borrar(int codigo) {
        Iterator<Producto> iterator = listaProductos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo() == codigo) {
                iterator.remove();
                guardar();
                return true; 
            }
        }
        return false; 
    }

    public List<Producto> consultarTodos() {
        return listaProductos;
    }

    private void guardar() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(listaProductos);
        } catch (Exception e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
