package com.guessgameschool.guessgame;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.util.Duration;
import trivia.Questions;

import java.util.Timer;
import java.util.TimerTask;

public class InGameController {

    public static  InGameController instance;
    private static Integer STARTTIME = 30;
    private Timeline timeline;
    private IntegerProperty timeSeconds = new SimpleIntegerProperty(STARTTIME);
    private static Questions questions = new Questions();

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
    public void question() {
        questionBox.setText(questions.query());
    }
    @FXML
    protected void optionOne() {
        questionBox.setText(questions.answer());

    }
    @FXML
    protected void optionTwo() {
        questionBox.setText("Button 2");

    }
    @FXML
    protected void optionThree() {
        questionBox.setText("Button 3");

    }
    @FXML
    protected void optionFour() {
        questionBox.setText("Button 4");

    }

    @FXML
    protected void stopPlay() {
        questionBox.setText("Stop playing");

    }

    @FXML
    protected void exitGame() {
        questionBox.setText("Exit game");
        //System.exit(0);


    }
    @FXML
    public void nextPlay() {
        Timer t = new Timer();
        t.schedule(new GameOver() {},  31000);


        countDownTimer.textProperty().bind(timeSeconds.asString());
        if (timeline != null) {
            timeline.stop();
        }
        timeSeconds.set(STARTTIME);
        timeline = new Timeline();
        timeline.getKeyFrames().add(
                new KeyFrame(Duration.seconds(STARTTIME+1),
                        new KeyValue(timeSeconds, 0)));
        timeline.playFromStart();

    }
    class GameOver extends TimerTask {
        public void run() {
            // System.exit är en möjlig lösnign till att avsluta spelet
            // (inte den besta men det är en lösnign)
            //System.exit(0);
            //metod för att få GAME OVER att dyka upp och att avsluta spelet
            //Kan outputa ett vårde som tas upp i en annan funktion t.ex. en if ()
            //if (output från GameOver = rättSvar) inget händer
            //if (output från GameOver = felSvar) print("GAME OVER") och System.exit(0);
            System.out.println(countDownTimer.getText());
            if (countDownTimer.getText().equals("0")) {
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }
    }
}