package com.firefighterstarter.modele.cell.FireFighter;

import com.firefighterstarter.modele.cell.Cell;
import com.firefighterstarter.modele.cell.ColorType;

import java.util.*;

public class FireFighterPaint extends Cell {
    private final int numberOfFireFighter;
    private List<FireFighter> listOfFireFighters;

    public FireFighterPaint(Cell[][] listOfCells, int numberOfFireFighter, int column, int rows) {
        super(listOfCells, column, rows);
        this.numberOfFireFighter = numberOfFireFighter;
        this.listOfFireFighters = new ArrayList<>();
    }

    /*public void initFireFighter() {
        for(int i = 0; i < numberOfFireFighter; i++) {
            int randomPosition = (int) (Math.random() * 1452);
            Cell currentCell = this.listOfCells.get(randomPosition);
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells.get(randomPosition).setColorType(ColorType.FIREFIGHTER);
                this.listOfFireFighters.add(new FireFighter(randomPosition));
            }

        }
    }*/

    /*public void mouveFireFighter() {
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
        try {
            if(onTheLeftPart(fireFighter.getPosition() + distance)) {
                if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance);
            }

            if(onTheLeftPart(fireFighter.getPosition() - distance)) {
                if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance);
            }

            if(onTheLeftPart(fireFighter.getPosition() + distance + 33)) {
                if(this.listOfCells.get(fireFighter.getPosition() + distance+ 33).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance + 33);
            }

            if(onTheRightPart(fireFighter.getPosition() + distance)) {
                if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance);
            }

            if(onTheRightPart(fireFighter.getPosition() - distance)) {
                if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance);
            }

            if(onTheRightPart(fireFighter.getPosition() - distance - 33)) {
                if(this.listOfCells.get(fireFighter.getPosition() - distance - 33).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance - 33);
            }

            else {
                if(this.listOfCells.get(fireFighter.getPosition() + distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance);

                if(this.listOfCells.get(fireFighter.getPosition() - distance).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance);

                if(this.listOfCells.get(fireFighter.getPosition() + distance + 33).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() + distance + 33);

                if(this.listOfCells.get(fireFighter.getPosition() - distance -33).getColor() == ColorType.FIRE)
                    fireFighter.addElement(fireFighter.getPosition() - distance -33);
            }


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error for fireFighter : " + fireFighter.getPosition() + " for distance : " + distance);
        }


    }



    private boolean onTheRightPart(int number) {
        return number >= 1419 && number <= 1452;
    }

    private boolean onTheLeftPart(int number) {
        return number >= 0 && number <= 32;
    }






    private List<FireFighter> deleteAllFireFromFireFighter(List<FireFighter> list) {
        for(FireFighter fireFighter : list)
            fireFighter.removeAllFires();
        return list;
    }
*/

}
