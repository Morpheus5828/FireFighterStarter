package com.firefighterstarter.controller;

import com.firefighterstarter.FireFighterApp;
import com.firefighterstarter.modele.cell.CellMouvementManager;
import com.firefighterstarter.view.DisplayGridPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


public final class Controller {
    @FXML Label congratulation;
    @FXML GridPane gridPane;
    @FXML Button play;
    @FXML Button stepByStep;
    private CellMouvementManager cmm;
    private DisplayGridPane display;
    public static int _click = 0;

    @FXML public void runStepByStep() {
        play.setVisible(false);
        if(_click == 0) {
            cmm = new CellMouvementManager(gridPane.getColumnCount(), gridPane.getRowCount());
            display = new DisplayGridPane(
                    gridPane,
                    gridPane.getColumnCount(),
                    gridPane.getRowCount(),
                    cmm.getListOfCells()
            );
            display.run();
            _click = 1;
        }
        else {
            display.setListOfCells(cmm.updateGrid());
            display.run();
            cmm.setListOfCells(cmm.updateGrid());
        }
    }

    @FXML public void play() {
        stepByStep.setVisible(false);
        cmm = new CellMouvementManager(gridPane.getColumnCount(), gridPane.getRowCount());
        display = new DisplayGridPane(
                gridPane,
                gridPane.getColumnCount(),
                gridPane.getRowCount(),
                cmm.getListOfCells()
        );
        display.run();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if(cmm.isEndGame()) {
                    cancel();
                    congratulation.setVisible(true);
                }

                display.setListOfCells(cmm.updateGrid());
                display.run();
                cmm.setListOfCells(cmm.updateGrid());
            }
        }, 1000, 100);

    }

    @FXML public void restart() {
        play.setVisible(true);
        stepByStep.setVisible(true);
        congratulation.setVisible(false);
    }



}