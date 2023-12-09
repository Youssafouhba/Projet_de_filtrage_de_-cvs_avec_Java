package com.example.projetjava.Apps;

import com.example.projetjava.controller.AuthController;
import com.example.projetjava.controller.InscriptionController;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class AuthApp extends Application {

    private Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("auth.fxml"));
        VBox root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Authentication");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
