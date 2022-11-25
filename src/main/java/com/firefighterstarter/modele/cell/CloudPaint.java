package com.firefighterstarter.modele.cell;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloudPaint extends Cell {
    private int numberOfClouds;
    private List<Cell> clouds;

    public CloudPaint(Cell[][] listOfCells, int numberOfClouds, int gridRows, int gridColumn) {
        super(listOfCells, gridRows, gridColumn);
        this.numberOfClouds = numberOfClouds;
        this.clouds = new ArrayList<>();
    }

    public void initCloud() {
        for(int i = 0; i < numberOfClouds; i++) {
            int randomColumn = (int) (Math.random() * gridColumn);
            int randomRow = (int) (Math.random() * gridRows);
            System.out.println(listOfCells[randomRow][randomColumn]);
            Cell currentCell = listOfCells[randomRow][randomColumn];
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells[randomRow][randomColumn].setColorType(ColorType.CLOUD);
                this.clouds.add(currentCell);
            }
        }
    }

    /*public void mouveCloud() {
        List<Integer> cloudsUpdate = new ArrayList<>();
        for(Integer cloudIndex : this.clouds) {
            if(cloudIndex < 1419) { // 1452 - 33
                if(this.listOfCells.get(cloudIndex).getColor() == ColorType.CLOUD) {
                    if(this.listOfCells.get(cloudIndex+1).getColor() == ColorType.FIRE)
                        this.listOfCells.get(cloudIndex+1).setColorType(ColorType.NOTHING);
                    ColorType nextColor = listOfCells.get(cloudIndex+33).getColor();
                    if(nextColor == ColorType.WAY || nextColor == ColorType.FIREFIGHTER) {
                        int index = cloudIndex;

                        while (listOfCells.get(index+33).getColor() == ColorType.WAY ||
                                listOfCells.get(index+33).getColor() == ColorType.FIREFIGHTER) {

                            if (
                                listOfCells.get(index + 66).getColor() == ColorType.NOTHING ||
                                listOfCells.get(index + 66).getColor() == ColorType.FIRE ||
                                listOfCells.get(index + 66).getColor() != ColorType.WAY
                            ) {
                                cloudsUpdate.add(index + 66);
                                this.listOfCells.get(index+66).setColorType(ColorType.CLOUD);
                                this.listOfCells.get(cloudIndex).setColorType(ColorType.NOTHING);
                                break;
                            }
                            index += 33;
                        }

                    }
                    else if (nextColor == ColorType.MOUNTAIN) {
                        int index = cloudIndex;

                        while (listOfCells.get(index+33).getColor() == ColorType.MOUNTAIN) {
                            if (
                                    listOfCells.get(index + 99).getColor() == ColorType.NOTHING ||
                                    listOfCells.get(index + 99).getColor() == ColorType.FIRE ||
                                    listOfCells.get(index + 99).getColor() != ColorType.WAY
                            ) {
                                cloudsUpdate.add(index + 99);
                                this.listOfCells.get(index+99).setColorType(ColorType.CLOUD);
                                this.listOfCells.get(cloudIndex).setColorType(ColorType.NOTHING);
                                break;
                            }
                            index += 33;
                        }


                    }
                    else if (nextColor == ColorType.NOTHING || nextColor == ColorType.FIRE
                    )
                    {
                        this.listOfCells.get(cloudIndex+33).setColorType(ColorType.CLOUD);
                        this.listOfCells.get(cloudIndex).setColorType(ColorType.NOTHING);
                        cloudsUpdate.add(cloudIndex+33);
                    }
                }
            }
            else {
                this.listOfCells.get(cloudIndex).setColorType(ColorType.NOTHING);
            }
        }
        this.clouds = cloudsUpdate;
    }*/

}
