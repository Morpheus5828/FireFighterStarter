package com.firefighterstarter.modele.cell;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public abstract class Cell {
    protected Color color;
    protected final String CLOUD_COLOR = "-fx-background-color: #706969;";
    protected final String FIRE_COLOR = "-fx-background-color: red;";
    protected final String WHITE_COLOR = "-fx-background-color: white;";
    protected final String WAY_COLOR = "-fx-background-color: #a5632a;";
    protected final String FF_COLOR = "-fx-background-color: black;";
    protected final String MOUNTAIN_COLOR = "-fx-background-color: f3c9a2;";

    public Cell(Color color) {
        this.color = color;
    }


    protected abstract void updateCellColor(Cell cell, String color);

    public abstract Color getColor();

}
