package com.firefighterstarter.view;

import com.firefighterstarter.modele.cell.Cell;
import com.firefighterstarter.modele.cell.ColorType;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.List;

public class DisplayGridPane {
    private List<Cell> listOfCells;
    private GridPane gridPane;
    private ColorType colorType;

    /*
    Here we update all cell in grid
     */

    public DisplayGridPane(GridPane gridpane) {
        this.gridPane = gridpane;
        colorType = ColorType.NOTHING;
    }

    public void run() {
        for(int i = 0; i < this.listOfCells.size(); i++) {
            ColorType color = this.listOfCells.get(i).getColor();
            this.gridPane.getChildren().get(i).setStyle(colorType.getBackgroundColor(color));
        }
    }

    public void setListOfCells(List<Cell> listOfCells) {
        this.listOfCells = listOfCells;
    }
}
