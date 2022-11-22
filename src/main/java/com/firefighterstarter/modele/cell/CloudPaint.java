package com.firefighterstarter.modele.cell;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloudPaint extends Cell {
    private int numberOfClouds;
    private List<Integer> clouds;

    public CloudPaint(List<Cell> listOfCells, int numberOfClouds) {
        super(listOfCells);
        this.numberOfClouds = numberOfClouds;
        this.clouds = new ArrayList<>();
    }

    public void initCloud() {
        for(int i = 0; i < numberOfClouds; i++) {
            int randomPosition = (int) (Math.random() * 1400);
            Cell currentCell = this.listOfCells.get(randomPosition);
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells.get(randomPosition).setColorType(ColorType.CLOUD);
                this.clouds.add(randomPosition);
            }
        }
    }

    public void mouveCloud() {
        List<Integer> cloudsUpdate = new ArrayList<>();
        for(Integer cloudIndex : this.clouds) {
            if(cloudIndex < 1419) {
                if(this.listOfCells.get(cloudIndex).getColor() == ColorType.CLOUD) {
                    ColorType nextColor = listOfCells.get(cloudIndex+33).getColor();
                    if(nextColor == ColorType.WAY) {
                        int index = cloudIndex;

                        while (listOfCells.get(index+33).getColor() == ColorType.WAY) {
                            System.out.print(index);
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

                    else if
                    (
                        nextColor == ColorType.NOTHING ||
                        nextColor == ColorType.FIRE

                    ) {
                        this.listOfCells.get(cloudIndex+33).setColorType(ColorType.CLOUD);
                        this.listOfCells.get(cloudIndex).setColorType(ColorType.NOTHING);
                        cloudsUpdate.add(cloudIndex+33);
                    }
                }
            }
        }
        this.clouds = cloudsUpdate;
    }

}
