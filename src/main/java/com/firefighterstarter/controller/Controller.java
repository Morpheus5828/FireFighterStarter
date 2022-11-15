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

    @FXML public void play() {
        if(counter == 0) {
            cellMouvementManager = new CellMouvementManager(gridpane);
            cellMouvementManager.initGrid();
            counter =  1;
        }
      else {
            cellMouvementManager.updateGrid();
        }
       /* play.setVisible(false);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                cellMouvementManager.updateGrid();
            }
        }, 4000, 4000);
        System.out.println("finished");*/
    }

    @FXML public void restart() {
        cellMouvementManager = new CellMouvementManager(gridpane);
        cellMouvementManager.restartGrid();
        play.setVisible(true);
        counter =  0;
    }
}