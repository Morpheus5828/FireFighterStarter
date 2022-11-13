package com.firefighterstarter.controller;

import com.firefighterstarter.view.grid.GridColor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.Timer;
import java.util.TimerTask;


public class Controller {
    private GridColor grid;

    private static int counter = 0;

    @FXML GridPane gridpane;
    @FXML Button play;

    @FXML public void play() {
        grid = new GridColor(gridpane);
        grid.initialise();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               grid.run();
            }
        }, 1000, 1000);
    }

    @FXML public void restart() {
        grid = new GridColor(gridpane);
        grid.paintReset();
        counter = 0;
    }
}