package com.firefighterstarter.view;

import com.firefighterstarter.modele.cell.Cell;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.List;

public class DisplayGridPane {
    private List<Cell> listOfCells;
    private GridPane gridPane;

    /*
    Here we update all
     */

    public DisplayGridPane(GridPane gridpane) {
        this.gridPane = gridpane;
    }

    public void run() {
        for(int i = 0; i < this.listOfCells.size(); i++) {
            String color = this.listOfCells.get(i).getColor().toString();
            this.gridPane.getChildren().get(i).setStyle(color);
        }
    }

    public void setListOfCells(List<Cell> listOfCells) {
        this.listOfCells = listOfCells;
    }
}
