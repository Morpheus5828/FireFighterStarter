package com.firefighterstarter.modele.cell;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloudPaint extends Cell {
    private int numberOfClouds;
    private Cell[][] clouds;

    public CloudPaint(Cell[][] listOfCells, int numberOfClouds, int gridRows, int gridColumn) {
        super(listOfCells, gridRows, gridColumn);
        this.numberOfClouds = numberOfClouds;
        this.clouds = new Cell[gridRows][gridColumn];
        initTab(clouds);


    }

    public void initCloud() {
        for(int i = 0; i < numberOfClouds; i++) {
            int randomColumn = (int) (Math.random() * gridColumn);
            int randomRow = (int) (Math.random() * gridRows);
            Cell currentCell = listOfCells[randomRow][randomColumn];
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells[randomRow][randomColumn].setColorType(ColorType.CLOUD);
                this.clouds[randomRow][randomColumn] = this.listOfCells[randomRow][randomColumn];
            }
        }
    }

    public void mouveCloud() {
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
    }
}
