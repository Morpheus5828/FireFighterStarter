package com.firefighterstarter.modele.cell;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloudPaint extends Cell {

    public CloudPaint() {

    }

    public ColorType getColor() {
        return ColorType.CLOUD;
    }


   /* public void mouveCloud() {
        Cell[][] cloudsUpdate = new Cell[gridRows][gridColumn];
        initTab(cloudsUpdate);
        for(int i = 0; i < gridRows; i++) {
            for(int j = 0; j < gridColumn; j++) {
                // case : on the right of the grid
                if(i == gridRows - 1) {
                    this.listOfCells[i][j].setColorType(ColorType.NOTHING);
                }

                else {
                    if(
                        this.listOfCells[i][j].getColor() == ColorType.CLOUD &&
                        this.listOfCells[i+1][j].getColor() == ColorType.NOTHING
                    ) {
                        this.clouds[i][j].setColorType(ColorType.NOTHING);
                        this.clouds[i+1][j].setColorType(ColorType.CLOUD);
                    }
                }
            }
        }

    }

    private void removeFire(int i, int j) {
        if(this.listOfCells[i][j+1].getColor() == ColorType.FIRE) {

        }
    }

    private void initTab(Cell[][] tab) {
        for(int i = 0; i < gridRows; i++) {
            for(int j = 0; j < gridColumn; j++)
                tab[i][j] = new Cell(listOfCells, gridRows, gridColumn);
        }
    }

    private void displayTab(Cell[][] tab) {
        for(int i = 0; i < gridRows; i++) {
            for(int j = 0; j < gridColumn; j++) {
                System.out.print(tab[i][j].getColor() + "\t ");
            }
            System.out.println();
        }
    }

    public Cell[][] getClouds() {
        this.listOfCells = clouds;
        return listOfCells;
    }*/
}
