package com.firefighterstarter.modele.cell;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class CloudPaint extends Cell {
    private int numberOfClouds;

    public CloudPaint(List<Cell> listOfCells, int numberOfClouds) {
        super(listOfCells);
        this.numberOfClouds = numberOfClouds;
    }

    public void initCloud() {
        for(int i = 0; i < numberOfClouds; i++) {
            int randomPosition = (int) (Math.random() * 1400);
            Cell currentCell = this.listOfCells.get(randomPosition);
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells.get(randomPosition).setColorType(ColorType.CLOUD);
            }
        }
    }

}
