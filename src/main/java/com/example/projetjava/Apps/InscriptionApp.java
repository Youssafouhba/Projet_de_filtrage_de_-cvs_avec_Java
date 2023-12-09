package com.example.projetjava.Apps;

import com.example.projetjava.controller.AuthController;
import com.example.projetjava.controller.InscriptionController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InscriptionApp extends Application {

    private InscriptionApp app;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Inscription.fxml"));
        VBox root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Registration");
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}