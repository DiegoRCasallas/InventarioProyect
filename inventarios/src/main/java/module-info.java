module com.proyecto.inventarios {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.proyecto.inventarios to javafx.fxml;
    exports com.proyecto.inventarios;
    exports com.proyecto.inventarios.controladores;
    opens com.proyecto.inventarios.controladores to javafx.fxml;
}