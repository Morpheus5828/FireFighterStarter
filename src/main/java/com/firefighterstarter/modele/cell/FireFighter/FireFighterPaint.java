package com.firefighterstarter.modele.cell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FireFighterPaint extends Cell {
    List<Integer> fireFighters;
    private int numberOfFireFighter;


    public FireFighterPaint(List<Cell> listOfCells, int numberOfFireFighter) {
        super(listOfCells);
        this.fireFighters = new ArrayList<>();
        this.listOfCells = listOfCells;
        this.numberOfFireFighter = numberOfFireFighter;
    }

    public void initFireFighter() {
        for(int i = 0; i < numberOfFireFighter; i++) {
            int randomPosition = (int) (Math.random() * 1400);
            Cell currentCell = this.listOfCells.get(randomPosition);
            if(currentCell.getColor() == ColorType.NOTHING) {
                this.listOfCells.get(randomPosition).setColorType(ColorType.FIREFIGHTER);
                this.fireFighters.add(randomPosition);
            }

        }
    }

    public void mouveFireFighter() {
        List<Integer> fireFightersUpdate = new ArrayList<>();
        List<Integer> fires;
        for(int i = 0; i < this.fireFighters.size(); i++) {
            fires = getFireInDistance(this.fireFighters.get(i));
            if(fires.size() != 0) {
                System.out.print(fires);
                System.out.println(this.fireFighters.get(i));
                this.listOfCells.get(this.fireFighters.get(i)).setColorType(ColorType.NOTHING);
                this.listOfCells.get(fires.get(0)).setColorType(ColorType.FIREFIGHTER);
                fireFightersUpdate.add(fires.get(0));
            }
        }
        //System.out.println(fireFightersUpdate);
        this.fireFighters = fireFightersUpdate;
    }

    private List<Integer> getFireInDistance(int position) {
        List<Integer> listOfFire = new ArrayList<>();
        boolean condition = true;
        int distance = 1;

        for (int currentDistance = 0; currentDistance < distance; currentDistance++) {
            if(position - currentDistance < 33 && position - currentDistance > 0) {
                if (this.listOfCells.get(position + currentDistance).getColor() == ColorType.FIRE) {
                    listOfFire.add(position + currentDistance);
                } if (this.listOfCells.get(position + currentDistance + 33).getColor() == ColorType.FIRE) {
                    listOfFire.add(position + currentDistance + 33);
                }
                else {
                    listOfFire.add(position);
                }
            }  if (position + currentDistance < CELL_NUMBER - 33 && position - currentDistance > 33) {
                if (this.listOfCells.get(position + currentDistance).getColor() == ColorType.FIRE) {
                    listOfFire.add(position + currentDistance);
                }  if (this.listOfCells.get(position + currentDistance + 33).getColor() == ColorType.FIRE) {
                    listOfFire.add(position + currentDistance + 33);
                }
            }
            if (this.listOfCells.get(position - currentDistance).getColor() == ColorType.FIRE) {
                listOfFire.add(position - currentDistance);
            }
            if (this.listOfCells.get(position - 33 - currentDistance).getColor() == ColorType.FIRE) {
                listOfFire.add(position - 33 - currentDistance);
            }
            else {
                listOfFire.add(position);
            }
        }
        return listOfFire;
    }


}
