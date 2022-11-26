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
            cmm.updateGrid();
            display.setListOfCells(cmm.getListOfCells());
            display.run();
        }
    }

    @FXML public void play() {

    }

    @FXML public void restart() {
        /*cmm = new CellMouvementManager(gridPane.getChildren().size());
        cmm.updateGrid();
        dgp = new DisplayGridPane(gridPane);
        dgp.setListOfCells(cmm.getListOfCells());
        _click = 0;*/
    }
}