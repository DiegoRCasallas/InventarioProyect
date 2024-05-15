package com.proyecto.inventarios.dao;
import com.proyecto.inventarios.modelos.Usuario;
import java.util.ArrayList;

public class UsuarioDao {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();


    public void crearNuevoUsuario(String name, String password) {
       Usuario usuario = new Usuario(name, password);
        listaUsuarios.add(usuario);
        System.out.println(usuario.getName());
    }
    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

}
