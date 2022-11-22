package com.firefighterstarter.modele.cell;

import javafx.scene.layout.GridPane;

import java.util.List;

public class MountainPaint extends Cell {
    private int numberOfMountainGroup;
    public MountainPaint(List<Cell> listOfCells, int numberOfMountainGroup) {
        super(listOfCells);
        this.numberOfMountainGroup = numberOfMountainGroup;
    }


    public void initMountain() {
        for(int i = 0; i < numberOfMountainGroup; i++) {
            int randomPosition = (int) (Math.random() * 1400);
            Cell currentCell = this.listOfCells.get(randomPosition);
            Cell rightCurrentCell = this.listOfCells.get(randomPosition + 33);
            Cell behindCurrentCell = this.listOfCells.get(randomPosition + 1);
            Cell diagonalCurrentCell = this.listOfCells.get(randomPosition + 34);
            if (
                    currentCell.getColor() == ColorType.NOTHING &&
                            rightCurrentCell.getColor() == ColorType.NOTHING &&
                            behindCurrentCell.getColor() == ColorType.NOTHING &&
                            diagonalCurrentCell.getColor() == ColorType.NOTHING
            )
            {
                currentCell.setColorType(ColorType.MOUNTAIN);
                rightCurrentCell.setColorType(ColorType.MOUNTAIN);
                behindCurrentCell.setColorType(ColorType.MOUNTAIN);
                diagonalCurrentCell.setColorType(ColorType.MOUNTAIN);
            }
        }
    }

}
