/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventarios.model;

import java.io.Serializable;

/**
 *
 * @author Camilo
 */
public class Producto implements Serializable{
    private String nombre;
    private int codigo;
    private String descripcion;
    private String categoria;
    private int stock;

    public Producto(String nombre, int codigo, String descripcion, String categoria, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.stock = stock;
    }
    
    
}
