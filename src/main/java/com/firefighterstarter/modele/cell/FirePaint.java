package com.firefighterstarter.modele.cell;

import javafx.scene.layout.GridPane;

public class FirePaint extends Cell {
    private int numberOfFire;

    public FirePaint(String color) {
        super(color);
    }



    @Override
    protected void updateCellColor(Cell cell, String color) {

    }
}

