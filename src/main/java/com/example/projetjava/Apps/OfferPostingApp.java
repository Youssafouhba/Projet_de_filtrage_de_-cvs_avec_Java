package com.example.projetjava.Apps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class OfferPostingApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Formulaire de poste");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Titre
        Label titleLabel = new Label("Titre:");
        GridPane.setConstraints(titleLabel, 0, 0);
        TextField titleField = new TextField();
        GridPane.setConstraints(titleField, 1, 0);

        // Description
        Label descriptionLabel = new Label("Description:");
        GridPane.setConstraints(descriptionLabel, 0, 1);
        TextArea descriptionArea = new TextArea();
        GridPane.setConstraints(descriptionArea, 1, 1);

        // Date de début
        Label startDateLabel = new Label("Date de début:");
        GridPane.setConstraints(startDateLabel, 0, 2);
        TextField startDateField = new TextField();
        GridPane.setConstraints(startDateField, 1, 2);

        // Lieu
        Label locationLabel = new Label("Lieu:");
        GridPane.setConstraints(locationLabel, 0, 3);
        TextField locationField = new TextField();
        GridPane.setConstraints(locationField, 1, 3);

        // Bouton de soumission
        Button submitButton = new Button("Soumettre");
        GridPane.setConstraints(submitButton, 0, 4);

        grid.getChildren().addAll(
                titleLabel, titleField,
                descriptionLabel, descriptionArea,
                startDateLabel, startDateField,
                locationLabel, locationField,
                submitButton
        );

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}