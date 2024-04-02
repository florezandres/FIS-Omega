package com.example.sgb;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SGBController {
    @FXML
    private Label welcomeText;
    //prueba commit Andres Florez

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}