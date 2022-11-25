package com.firefighterstarter.view;

import com.firefighterstarter.modele.cell.Cell;
import com.firefighterstarter.modele.cell.ColorType;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.List;

public class DisplayGridPane {
    private Cell[][] listOfCells;
    private GridPane gridPane;
    private ColorType colorType;
    private int column;
    private int row;

    /*
    Here we update all cell in grid
     */

    public DisplayGridPane(GridPane gridpane, int column, int row, Cell[][] listOfCells) {
        this.gridPane = gridpane;
        this.listOfCells = listOfCells;
        colorType = ColorType.NOTHING;
        this.column = column;
        this.row = row;
    }

    public void run() {
        int index = 0;
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                ColorType color = this.listOfCells[i][j].getColor();
                this.gridPane.getChildren().get(index).setStyle(colorType.getBackgroundColor(color));
                index++;
            }
        }
    }

    public void setListOfCells(Cell[][] listOfCells) {
        this.listOfCells = listOfCells;
    }
}
