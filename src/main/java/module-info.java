module com.example.projetjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires jbcrypt;
    requires spire.pdf;


    opens com.example.projetjava to javafx.fxml;
    exports com.example.projetjava.controller;
    opens com.example.projetjava.controller to javafx.fxml;
    exports com.example.projetjava.Apps;
    opens com.example.projetjava.Apps to javafx.fxml;
    exports com.example.projetjava;
}