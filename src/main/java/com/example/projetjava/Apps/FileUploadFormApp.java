package com.example.projetjava.Apps;
import com.example.projetjava.Traitement.extractTextfromPDF;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileUploadFormApp extends Application {
    private File selectedFile;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("File Upload Form");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Create the file selection label
        Label fileLabel = new Label("Selected File: ");
        gridPane.add(fileLabel, 0, 0);

        // Create the file selection button
        Button fileButton = new Button("Choose File");
        fileButton.setOnAction(e -> selectFile(primaryStage));
        gridPane.add(fileButton, 1, 0);

        // Create the upload button
        Button uploadButton = new Button("Upload");
        uploadButton.setOnAction(e -> uploadFile());
        gridPane.add(uploadButton, 1, 1);

        Scene scene = new Scene(gridPane, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void selectFile(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select a File");

        selectedFile = fileChooser.showOpenDialog(primaryStage);
        if (selectedFile != null) {
            // Update the file selection label
            Label fileLabel = (Label) primaryStage.getScene().getRoot().getChildrenUnmodifiable().get(0);
            fileLabel.setText("Selected File: " + selectedFile.getName());
        }
    }

    private void uploadFile() {
        if (selectedFile != null) {
            // Define the destination directory to store the uploaded file
            String destinationDirectory = "C:/Users/hp/Downloads/ProjetJava/src/main/java/com/example/projetjava/Traitement/";

            // Create the destination directory if it doesn't exist
            File directory = new File(destinationDirectory);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Define the destination file path
            String destinationFilePath = destinationDirectory + File.separator + selectedFile.getName();

            try {
                // Copy the selected file to the destination directory
                Path sourcePath = selectedFile.toPath();
                Path destinationPath = Path.of(destinationFilePath);
                Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                extractTextfromPDF textfromPDF = new extractTextfromPDF();
                textfromPDF.extractText(destinationFilePath,destinationDirectory );
                System.out.println("File uploaded successfully. Destination: " + destinationFilePath);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error uploading file.");
            }
        } else {
            System.out.println("No file selected.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}