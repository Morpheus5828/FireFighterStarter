package com.firefighterstarter.modele.cell;

import java.util.List;

public class FireFighterPaint extends Cell {

    private int numberOfFireFighter;


    public FireFighterPaint(List<Cell> listOfCells, int numberOfFireFighter) {
        super(listOfCells);
       this.listOfCells = listOfCells;
       this.numberOfFireFighter = numberOfFireFighter;
    }

    public void initFireFighter() {
        for(int i = 0; i < numberOfFireFighter; i++) {
            int randomPosition = (int) (Math.random() * 1400);
            Cell currentCell = this.listOfCells.get(randomPosition);
            if(currentCell.getColor() == ColorType.NOTHING)
                this.listOfCells.get(randomPosition).setColorType(ColorType.FIREFIGHTER);
        }
    }




}
