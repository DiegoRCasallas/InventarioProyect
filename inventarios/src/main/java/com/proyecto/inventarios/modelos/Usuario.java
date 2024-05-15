package com.proyecto.inventarios.modelos;

public class Usuario {
    private String name;
    private String password;

    public Usuario(String name, String password) {
        this.name= name;
        this.password=password;
    }

    public String getName() {
        return name;
    }

}
