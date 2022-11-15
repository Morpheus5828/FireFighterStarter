package com.firefighterstarter.controller;

import com.firefighterstarter.view.grid.CellMouvementManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.Timer;
import java.util.TimerTask;


public class Controller {
    private CellMouvementManager cellMouvementManager;
    private static int counter = 0;
    @FXML GridPane gridpane;
    @FXML Button play;
    @FXML Button stepByStep;

    @FXML public void runStepByStep() {
        if(counter == 0) {
            cellMouvementManager = new CellMouvementManager(gridpane);
            cellMouvementManager.initGrid();
            counter =  1;
        }
      else
            cellMouvementManager.updateGrid();
            //todo le update n'effectue qu'un seul déplacement
    }

    @FXML public void play() {
        //TODO lorsque play est en commentaire le step by step fonctionne
        cellMouvementManager = new CellMouvementManager(gridpane);
        cellMouvementManager.initGrid();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                cellMouvementManager.updateGrid();
            }
        },1000,1000);
    }

    @FXML public void restart() {
        cellMouvementManager.restartGrid();
        play.setVisible(true);
        counter =  0;
    }
}