package com.firefighterstarter.modele.cell;

import javafx.scene.paint.Color;

public class WhitePaint extends Cell {
    private Color color;

    public WhitePaint(Color color) {
        super(color);
    }

    @Override
    protected void updateCellColor(Cell cell, String color) {

    }
}
