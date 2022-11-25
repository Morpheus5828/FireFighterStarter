package com.firefighterstarter.modele.cell;

import java.util.List;

public class FirePaint extends Cell {
    private int numberOfFire;
    public FirePaint(Cell[][] listOfCells, int numberOfFire,int gridRows, int gridColumn) {
        super(listOfCells, gridRows, gridColumn);
        this.numberOfFire = numberOfFire;
    }

    public void initFire() {
        /*for(int i = 0; i < this.numberOfFire; i++) {
            int randomPosition = (int) (Math.random() * 1452);
            Cell currentCell = this.listOfCells.get(randomPosition);
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells.get(randomPosition).setColorType(ColorType.FIRE);
            }
        }*/
    }

    public void mouveFire() {

    }



}

// abscisse de 0 43 44 valeurs
// ordonnée de 0 à 32 valeurs
