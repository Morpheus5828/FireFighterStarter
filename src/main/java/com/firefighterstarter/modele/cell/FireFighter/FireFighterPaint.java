package com.firefighterstarter.modele.cell.FireFighter;

import com.firefighterstarter.modele.cell.Cell;
import com.firefighterstarter.modele.cell.ColorType;

import java.util.*;

public class FireFighterPaint extends Cell {
    private final int numberOfFireFighter;
    private List<FireFighter> listOfFireFighters;

    public FireFighterPaint(List<Cell> listOfCells, int numberOfFireFighter) {
        super(listOfCells);

        this.listOfCells = listOfCells;
        this.numberOfFireFighter = numberOfFireFighter;
        this.listOfFireFighters = new ArrayList<>();
    }

    public void initFireFighter() {
        for(int i = 0; i < numberOfFireFighter; i++) {
            int randomPosition = (int) (Math.random() * 1400);
            Cell currentCell = this.listOfCells.get(randomPosition);
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells.get(randomPosition).setColorType(ColorType.FIREFIGHTER);
                this.listOfFireFighters.add(new FireFighter(randomPosition));
            }

        }
    }

    public void mouveFireFighter() {
        List<FireFighter> update = new ArrayList<>();
        for(FireFighter fireFighter : this.listOfFireFighters) {
            for(int ditance = 1; ditance <= 2; ditance++) {
                getFireInDistance(fireFighter, ditance);
            }
            if(fireFighter.getFires().size() != 0) {
                this.listOfCells.get(fireFighter.getFires().get(0)).setColorType(ColorType.FIREFIGHTER);
                this.listOfCells.get(fireFighter.getPosition()).setColorType(ColorType.NOTHING);
                update.add(new FireFighter(fireFighter.getFires().get(0)));
            } else {
                update.add(fireFighter);
            }
        }
        //deleteAllFireFromFireFighter(update);
        this.listOfFireFighters = deleteAllFireFromFireFighter(update);
    }

    private void getFireInDistance(FireFighter fireFighter, int distance) {
        // case one: fireFighter is on the left of grid
        if(fireFighter.getPosition() == 0) {
            if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + distance);

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance)).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (33 * distance));

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance) + distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (33 * distance) + distance);
        }

        if(fireFighter.getPosition() == 1472) {
            if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - distance);

            if(this.listOfCells.get(fireFighter.getPosition() - (33 * distance)).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - (33 * distance));

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance) - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - (33 * distance) - distance);
        }

        if(fireFighter.getPosition() < 33 && fireFighter.getPosition() != 0) {
            if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - distance);

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance)).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (33 * distance));

            if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + distance);

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance) + distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (33 * distance) + distance);

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance) - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (33 * distance) - distance);

        }

        if(fireFighter.getPosition() >= 33 && fireFighter.getPosition() <= 1400) {
            if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - distance);

            if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + distance);

            if(this.listOfCells.get(fireFighter.getPosition() - (33 * distance)).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - (distance * 33));

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance)).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (distance * 33));

            // en diagonale
            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance) + distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (distance * 33) + distance);

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance) - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (distance * 33) - distance);

            if(this.listOfCells.get(fireFighter.getPosition() - (33 * distance) - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - (distance * 33) - distance);

            if(this.listOfCells.get(fireFighter.getPosition() + (33 * distance) - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + (distance * 33) - distance);

        }

        // case tree: fireFighter is on the right of grid
        if(fireFighter.getPosition() > 1472 && fireFighter.getPosition() != 1472) {
            if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - distance);

            if(this.listOfCells.get(fireFighter.getPosition() - (33 * distance)).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - (33 * distance));

            if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() + distance);

            if(this.listOfCells.get(fireFighter.getPosition() - (33 * distance) -distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - (33 * distance) -distance);

            if(this.listOfCells.get(fireFighter.getPosition() - (33 * distance) + distance).getColor() == (ColorType.FIRE))
                fireFighter.addElement(fireFighter.getPosition() - (33 * distance) + distance);
        }


    }

    private List<FireFighter> deleteAllFireFromFireFighter(List<FireFighter> list) {
        for(FireFighter fireFighter : list)
            fireFighter.removeAllFires();
        return list;
    }


}
