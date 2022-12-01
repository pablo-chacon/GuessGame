package com.guessgameschool.guessgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class InGameController {
    @FXML
    private Label questionBox;
    @FXML
    private Label countDownTimer;
    @FXML
    private RadioButton lvl1;
    @FXML
    private RadioButton lvl2;
    @FXML
    private RadioButton lvl3;
    @FXML
    private RadioButton lvl4;
    @FXML
    private RadioButton lvl5;
    @FXML
    private RadioButton lvl6;
    @FXML
    private RadioButton lvl7;
    @FXML
    private RadioButton lvl8;
    @FXML
    private RadioButton lvl9;
    @FXML
    private RadioButton lvl10;
    @FXML
    private RadioButton lvl11;
    @FXML
    private RadioButton lvl12;
    @FXML
    private RadioButton lvl13;
    @FXML
    private RadioButton lvl14;
    @FXML
    private RadioButton lvl15;
    @FXML
    private RadioButton lvl16;
    @FXML
    private RadioButton lvl17;
    @FXML
    private RadioButton lvl18;
    @FXML
    private RadioButton lvl19;
    @FXML
    private RadioButton lvl20;


    @FXML
    protected void optionOne() {
        questionBox.setText("You pressed button nr one");

    }
    @FXML
    protected void optionTwo() {
        questionBox.setText("You pressed button nr two");

    }
    @FXML
    protected void optionThree() {
        questionBox.setText("You pressed button nr three");

    }
    @FXML
    protected void optionFour() {
        questionBox.setText("You pressed button nr four");

    }

    @FXML
    protected void stopPlay() {
        questionBox.setText("Stop playing");

    }

    @FXML
    protected void exitGame() {
        questionBox.setText("Exit game");

    }
}
