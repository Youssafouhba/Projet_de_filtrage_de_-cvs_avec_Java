package com.example.projetjava.controller;

import com.example.projetjava.Apps.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class InscriptionController {

    private Main app;

    @FXML
    private Button switchButton;

    @FXML
    private void initialize() {
        switchButton.setOnAction(event ->switchToScene1());
    }


    public void setApp(Main sceneSwitcherApp) {
        this.app = sceneSwitcherApp;
    }

    @FXML
    private void switchToScene1() {
        app.switchToScene1();
    }
}
/*
package com.example.projetjava.controller;

import com.example.projetjava.Apps.AuthApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.mindrot.jbcrypt.BCrypt;

public class InscriptionController{
    private AuthApp app;
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private Label errorLabel;

    @FXML
    private Button registerButton;
    @FXML
    private Button registerButt;
    public void initialize() {
        errorLabel.setText("");
        registerButton.setOnAction(event -> register());
    }

    public void register() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (!password.equals(confirmPassword)) {
            errorLabel.setText("Passwords do not match");
            return;
        }

        if(password.length() < 8){
            errorLabel.setText("Password must be at least 8 character !");
            return;
        }

        if (createUser(username, password)) {
            // Successful registration
            // Proceed to the application or display a success message
            errorLabel.setText(hashMotDePasse(password));
            // ...
        } else {
            // Failed to create user
            // Display an error message
            errorLabel.setText("Failed to create user");
        }
    }

    private String hashMotDePasse(String motDePasse) {
        return BCrypt.hashpw(motDePasse, BCrypt.gensalt());
    }

    private boolean createUser(String username, String password) {

        // Perform user creation logic
        // Example: Store the user in a database or call a registration service
        // Return true if user creation succeeds, false otherwise
        // ...
        return true;
    }

}*/