package com.firefighterstarter.controller;

import com.firefighterstarter.view.grid.Grid;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Controller {
    private Grid grid;
    @FXML GridPane gridpane;

    public Controller() {
    }

    @FXML public void play() {
        grid = new Grid(gridpane);
        grid.initialise();
    }

    @FXML public void restart() {
        grid = new Grid(gridpane);
        grid.paintReset();
    }




}