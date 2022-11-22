package com.firefighterstarter.modele.cell;

import javafx.scene.layout.GridPane;

import java.util.List;

public class WayPaint extends Cell {

    public WayPaint(List<Cell> listOfCells) {
        super(listOfCells);

    }

    public void initWay() {
        for(int i = 0; i < 5; i++)
            this.listOfCells.get(i).setColorType(ColorType.WAY);
        for(int i = 37; i < 400; i += 33)
            this.listOfCells.get(i).setColorType(ColorType.WAY);
        for(int i = 400; i < 415; i++)
            this.listOfCells.get(i).setColorType(ColorType.WAY);
        for(int i =415; i < 800; i += 33)
            this.listOfCells.get(i).setColorType(ColorType.WAY);
    }

}
