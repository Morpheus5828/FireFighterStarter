package com.firefighterstarter.controller;

import com.firefighterstarter.view.grid.CellMouvementManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.util.Timer;
import java.util.TimerTask;


public class Controller {
    private CellMouvementManager cellMouvementManager;
    @FXML GridPane gridpane;
    @FXML Button play;

    @FXML public void play() {
        cellMouvementManager = new CellMouvementManager(gridpane);
        cellMouvementManager.initGrid();

        play.setVisible(false);
        while (cellMouvementManager.getNumberOfFire() != 0) {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    cellMouvementManager.updateGrid();;
                }
            }, 1000, 1000);
        }
        System.out.println("finished");
    }

    @FXML public void restart() {
        cellMouvementManager = new CellMouvementManager(gridpane);
        cellMouvementManager.restartGrid();
        play.setVisible(true);
    }
}