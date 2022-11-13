package com.firefighterstarter.controller;

import com.firefighterstarter.view.grid.GridColor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Controller {
    private GridColor grid;

    private static int counter = 0;

    @FXML GridPane gridpane;
    @FXML Button play;

    @FXML public void play() {
        grid = new GridColor(gridpane);
        if(counter == 0) {
            grid.initialise();
            counter = 1;
            //play.setDisable(true);
        } else {
            grid.run();
        }





    }

    @FXML public void restart() {
        grid = new GridColor(gridpane);
        grid.paintReset();
        counter = 0;
    }






}