package com.firefighterstarter.modele.cell;

import java.util.List;

public class FirePaint extends Cell {
    private int numberOfFire;
    public FirePaint(List<Cell> listOfCells, int numberOfFire) {
        super(listOfCells);
        this.listOfCells = listOfCells;
        this.numberOfFire = numberOfFire;
    }

    public void initFire() {
        for(int i = 0; i < this.numberOfFire; i++) {
            int randomPosition = (int) (Math.random() * 1400);
            Cell currentCell = this.listOfCells.get(randomPosition);
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells.get(randomPosition).setColorType(ColorType.FIRE);
            }
        }
    }


}

