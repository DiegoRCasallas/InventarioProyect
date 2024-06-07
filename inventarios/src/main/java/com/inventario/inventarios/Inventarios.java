
package com.inventario.inventarios;
import com.inventario.inventarios.controller.ClienteController;
import com.inventario.inventarios.controller.MainController;
import com.inventario.inventarios.view.VistaCliente;
import com.inventario.inventarios.view.VistaPrincipal;
import com.inventario.inventarios.view.vistaProveedor;

public class Inventarios {

    public static void main(String[] args) {
       
     //ClienteController cosaa = new ClienteController(new VistaCliente());
   // ProveedorController cosaa = new ProveedorController(new vistaProveedor());
    MainController Mcontrol= new MainController(new VistaPrincipal());
  
    }
}
