package com.example.quaternarycalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class QuaternaryCalculatorController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}