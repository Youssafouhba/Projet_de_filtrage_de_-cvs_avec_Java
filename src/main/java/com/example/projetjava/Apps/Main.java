package com.example.projetjava.Apps;


import com.example.projetjava.controller.AuthController;
import com.example.projetjava.controller.InscriptionController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;


import javafx.scene.Parent;


import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;

        // Load the scenes from FXML files
        loadScene1();
        loadScene2();

        // Set the initial scene
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene 1");
        primaryStage.show();
    }

    private void loadScene1() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Auth.fxml"));
            Parent root1 = loader.load();
            scene1 = new Scene(root1);
            AuthController controller1 = loader.getController();
            controller1.setApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadScene2() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Inscription.fxml"));
            Parent root2 = loader.load();
            scene2 = new Scene(root2);
            InscriptionController controller2 = loader.getController();
            controller2.setApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToScene1() {
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Scene 1");
    }

    public void switchToScene2() {
        primaryStage.setScene(scene2);
        primaryStage.setTitle("Scene 2");
    }

    public static void main(String[] args) {
        launch(args);
    }
}