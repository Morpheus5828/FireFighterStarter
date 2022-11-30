package com.firefighterstarter.controller;

import com.firefighterstarter.modele.cell.Manager.FFCellMouvementManager;
import com.firefighterstarter.modele.cell.Manager.PandemicCellMouvementManager;
import com.firefighterstarter.view.DisplayGridPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.Timer;
import java.util.TimerTask;


public final class Controller {
    boolean gameOne;
    boolean gameTwo;
    @FXML Label congratulation;
    @FXML GridPane gridPane;
    @FXML Button play;
    @FXML Button stepByStep;
    @FXML Button taskOne;
    @FXML Button taskTwo;
    @FXML Button restart;

    private FFCellMouvementManager cmm;
    private PandemicCellMouvementManager pcm;
    private DisplayGridPane display;
    public static int _click = 0;

    /* TaskOne FireFighterApp*/
    @FXML public void fireFighterApp() {
        gameOne = true;
        gameTwo = false;
        this.play.setVisible(true);
        this.stepByStep.setVisible(true);
        this.restart.setVisible(true);
    }

    /* TaskTwo Pandemic */
    @FXML public void pandemic() {
        gameOne = false;
        gameTwo = true;

        this.play.setVisible(true);
        this.stepByStep.setVisible(true);
        this.restart.setVisible(true);
    }


    @FXML public void runStepByStep() {
        if(gameOne) {
            if(_click == 0) {
                cmm = new FFCellMouvementManager(gridPane.getColumnCount(), gridPane.getRowCount());
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
        } else {
            if(_click == 0) {
                pcm = new PandemicCellMouvementManager(gridPane.getColumnCount(), gridPane.getRowCount());
                display = new DisplayGridPane(
                        gridPane,
                        gridPane.getColumnCount(),
                        gridPane.getRowCount(),
                        pcm.getListOfCells()
                );
                display.run();
                _click = 1;
            }
            else {
                display.setListOfCells(pcm.updateGrid());
                display.run();
                pcm.setListOfCells(pcm.updateGrid());
            }
        }
    }

    @FXML public void play() {
        if(gameOne) {
            stepByStep.setVisible(false);
            cmm = new FFCellMouvementManager(gridPane.getColumnCount(), gridPane.getRowCount());
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
                        //congratulation.setVisible(true);
                    }

                    display.setListOfCells(cmm.updateGrid());
                    display.run();
                    cmm.setListOfCells(cmm.updateGrid());
                }
            }, 1000, 100);

        }
    }

    @FXML public void restart() {
        play.setVisible(true);
        stepByStep.setVisible(true);
    }


}