package com.guessgameschool.guessgame;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.util.Duration;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InGameController {
    public static  InGameController instance;

    public InGameController(){
        instance = this;
    }
    @FXML
    private Label questionBox;
    @FXML
    public Label countDownTimer;
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
    @FXML
    public void nextPlay() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override public void handle(ActionEvent actionEvent) {
                                Calendar time = Calendar.getInstance();
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ss");
                                countDownTimer.setText("0");
                                countDownTimer.setText(simpleDateFormat.format(time.getTime()));
                            }
                        }
                ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}
