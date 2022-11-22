package com.firefighterstarter.modele.cell;

/*
    Create a grid with color square
*/

import javafx.scene.layout.GridPane;

public abstract class Cell {
    protected final String CLOUD_COLOR = "-fx-background-color: #706969;";
    protected final String FIRE_COLOR = "-fx-background-color: red;";
    protected final String WHITE_COLOR = "-fx-background-color: white;";
    protected final String WAY_COLOR = "-fx-background-color: #a5632a;";
    protected final String FF_COLOR = "-fx-background-color: black;";
    protected final String MOUNTAIN_COLOR = "-fx-background-color: f3c9a2;";
    protected GridPane gridPane;

    public Cell(GridPane gridPane) {
        this.gridPane = gridPane;
    }

    protected abstract void initPaint();

    //protected abstract void setThreadIsRunnable(boolean threadIsRunnable);

}
