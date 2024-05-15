package com.proyecto.inventarios.controladores;

import com.proyecto.inventarios.dao.UsuarioDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class UsuarioController {
    UsuarioDao dao = new UsuarioDao();

    @FXML
    public TextField txtInputPassword;
    @FXML
    public TextField txtInputUsuario;
    @FXML
    public TextArea tArea;
    @FXML
    public Button btnCrearUsuario, btnMostrarUsuarios;

    @FXML
    private void eCrearUsuario(){
        String name=txtInputUsuario.getText();
        String pass= txtInputPassword.getText();
        dao.crearNuevoUsuario(name,pass);
        tArea.setText(dao.getListaUsuarios().getFirst().getName()+".");



        }
    }


