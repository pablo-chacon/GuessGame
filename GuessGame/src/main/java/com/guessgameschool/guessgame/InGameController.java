package com.guessgameschool.guessgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InGameController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}