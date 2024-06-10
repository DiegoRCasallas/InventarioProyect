/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventarios.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Camilo
 */
public class Venta implements Serializable{
    private int idVenta;
    private Date fechaDeVenta;
    private Cliente cliente;
    private List<Detalle> listadedetalles;
    private double subtotal;
    private double iva;
    private double total;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaDeVenta() {
        return fechaDeVenta;
    }

    public void setFechaDeVenta(Date fechaDeVenta) {
        this.fechaDeVenta = fechaDeVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Detalle> getListadedetalles() {
        return listadedetalles;
    }

    public void setListadedetalles(List<Detalle> listadedetalles) {
        this.listadedetalles = listadedetalles;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
