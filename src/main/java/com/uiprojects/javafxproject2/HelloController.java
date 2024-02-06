package com.uiprojects.javafxproject2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField lengthField;

    @FXML
    private TextField azimuthField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");



    }

    @FXML
    protected void handleCalculateButton() {
        welcomeText.setText("Welcome to JavaFX Application!");

        // Add your Minimum Curvature calculation logic here
        double length = Double.parseDouble(lengthField.getText());
        double azimuth = Double.parseDouble(azimuthField.getText());

        // Replace the following line with your actual calculation logic
        double result = length * azimuth;

        resultLabel.setText("Result: " + result);
    }
}