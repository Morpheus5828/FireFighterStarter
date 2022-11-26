package com.firefighterstarter.controller;

import com.firefighterstarter.modele.cell.CellMouvementManager;
import com.firefighterstarter.view.DisplayGridPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;


public final class Controller {
    @FXML GridPane gridPane;
    @FXML Button play;
    @FXML Button stepByStep;
    private CellMouvementManager cmm;
    private DisplayGridPane display;
    public static int _click = 0;

    @FXML public void runStepByStep() {
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

    }

    @FXML public void restart() {

    }
}