package com.firefighterstarter.modele.cell;

import com.firefighterstarter.modele.cell.FireFighter.FireFighter;
import com.firefighterstarter.modele.cell.FireFighter.FireFighterPaint;

import java.util.ArrayList;
import java.util.List;

public class CellMouvementManager {
    private Cell[][] listOfCells;
    private int columnNumber;
    private int rowsNumber;
    private final int numberOfCloud = 20;
    private final int numberOfMountainGroup = 6;
    private final int numberOfFire = 100;
    private final int numberOfFireFighter = 10;
    private List<FireFighter> fireFighters;

    public CellMouvementManager(int columnNumber, int rowsNumber) {
        this.columnNumber = columnNumber;
        this.rowsNumber = rowsNumber;
        this.listOfCells = new Cell[columnNumber][rowsNumber];
        this.fireFighters = new ArrayList<>();
        initGrid();
    }

    public void initGrid() {
        //initialise all cells
        for(int i = 0; i < this.columnNumber; i++) {
            for(int j = 0; j < this.rowsNumber; j++) {
                Cell cell = new WhitePaint();
                this.listOfCells[i][j] = cell;
            }
        }

        // add clouds on the grid
        //initMountain();
        initCloud();
        initFire();
        initFireFighter();
    }

    public Cell[][] updateGrid() {

        Cell[][] updateTab = new Cell[columnNumber][rowsNumber];

        for(int i = 0; i < this.columnNumber; i++)
            if (this.rowsNumber >= 0) System.arraycopy(this.listOfCells[i], 0, updateTab[i], 0, this.rowsNumber);


        //mouveCloud(updateTab);
       // mouveFF(updateTab);
        mouvFire(updateTab);

        return updateTab;
    }

    public void initMountain() {
        for (int i = 0; i < numberOfMountainGroup; i++) {
            int randomColumn = (int) (Math.random() * columnNumber);
            int randomRow = (int) (Math.random() * rowsNumber);

            if(randomColumn + 1 < columnNumber && randomColumn - 1 > 0 && randomRow - 1 > 0) {
                Cell currentCell = listOfCells[randomColumn][randomRow];
                Cell leftCell = listOfCells[randomColumn+1][randomRow];
                Cell rightCell = listOfCells[randomColumn-1][randomRow];
                Cell bottomCell = listOfCells[randomColumn][randomRow-1];

                if (
                        currentCell.getColor() == ColorType.NOTHING &&
                        leftCell.getColor() == ColorType.NOTHING &&
                        rightCell.getColor() == ColorType.NOTHING &&
                        bottomCell.getColor() == ColorType.NOTHING
                )
                {
                    Cell cell = new MountainPaint();
                    Cell cell1 = new MountainPaint();
                    Cell cell2 = new MountainPaint();
                    Cell cell3 = new MountainPaint();
                    this.listOfCells[randomColumn][randomRow] = cell;
                    this.listOfCells[randomColumn+1][randomRow] = cell1;
                    this.listOfCells[randomColumn-1][randomRow] = cell2;
                    this.listOfCells[randomColumn][randomRow-1] = cell3;

                }
            }

        }
    }

    private void initCloud() {
        for (int i = 0; i < numberOfCloud; i++) {
            int randomColumn = (int) (Math.random() * columnNumber);
            int randomRow = (int) (Math.random() * rowsNumber);
            Cell currentCell = listOfCells[randomColumn][randomRow];
            if (currentCell.getColor() == ColorType.NOTHING) {
                Cell cloud = new CloudPaint();
                this.listOfCells[randomColumn][randomRow] = cloud;
            }
        }
    }

    public void initFire() {
        for (int i = 0; i < numberOfFire; i++) {
            int randomColumn = (int) (Math.random() * columnNumber);
            int randomRow = (int) (Math.random() * rowsNumber);
            Cell currentCell = listOfCells[randomColumn][randomRow];
            if (currentCell.getColor() == ColorType.NOTHING) {
                Cell fire = new FirePaint();
                this.listOfCells[randomColumn][randomRow] = fire;
            }
        }
    }

    public void initFireFighter() {
        for (int i = 0; i < numberOfFireFighter; i++) {
            int randomColumn = (int) (Math.random() * columnNumber);
            int randomRow = (int) (Math.random() * rowsNumber);
            Cell currentCell = listOfCells[randomColumn][randomRow];
            if (currentCell.getColor() == ColorType.NOTHING) {
                Cell fireFighter = new FireFighterPaint();
                this.listOfCells[randomColumn][randomRow] = fireFighter;
                this.fireFighters.add(new FireFighter(randomColumn, randomRow));
            }
        }
    }

    /*public void initWay() {
        for(int i = 0; i < 5; i++)
            this.listOfCells.get(i).setColorType(ColorType.WAY);
        for(int i = 37; i < 400; i += 33)
            this.listOfCells.get(i).setColorType(ColorType.WAY);
        for(int i = 400; i < 415; i++)
            this.listOfCells.get(i).setColorType(ColorType.WAY);
        for(int i =415; i < 800; i += 33)
            this.listOfCells.get(i).setColorType(ColorType.WAY);
    }*/
    //TODO carré beige se font bouffer par les cloud
    public void mouveCloud(Cell[][] updateTab) {

        for(int i = 0; i < this.rowsNumber; i++) {
            for(int j = 0; j < this.columnNumber; j++) {
                if(this.listOfCells[j][i].getColor() == ColorType.CLOUD) {
                    if(j <= columnNumber - 2 ) {
                        if(this.listOfCells[j+1][i].getColor() == ColorType.MOUNTAIN && this.listOfCells[j+2][i].getColor() == ColorType.MOUNTAIN) {
                            if(j + 4 < 42 && (this.listOfCells[j+4][i].getColor() == ColorType.NOTHING || this.listOfCells[j+4][i].getColor() == ColorType.FIRE)) {
                                updateTab[j+4][i] = new CloudPaint();
                                updateTab[j][i] = new WhitePaint();
                            }
                        }
                        if(this.listOfCells[j+1][i].getColor() == ColorType.MOUNTAIN && this.listOfCells[j+2][i].getColor() != ColorType.MOUNTAIN) {
                            if(j + 2 < 42 && (this.listOfCells[j+2][i].getColor() == ColorType.NOTHING || this.listOfCells[j+2][i].getColor() == ColorType.FIRE)) {
                                updateTab[j+2][i] = new CloudPaint();
                                updateTab[j][i] = new WhitePaint();
                            }
                        }
                        if(this.listOfCells[j+1][i].getColor() == ColorType.FIREFIGHTER && this.listOfCells[j+2][i].getColor() == ColorType.NOTHING) {
                            updateTab[j+2][i] = new CloudPaint();
                            updateTab[j][i] = new WhitePaint();
                        }
                        else {
                            if(this.listOfCells[j+1][i].getColor() == ColorType.FIREFIGHTER && this.listOfCells[j+2][i].getColor() == ColorType.NOTHING) {
                                updateTab[j+2][i] = new CloudPaint();
                                updateTab[j][i] = new WhitePaint();
                            }
                            updateTab[j+1][i] = new CloudPaint();
                            updateTab[j][i] = new WhitePaint();
                        }
                        // delete fire under cloud
                        if(i + 1 < 31 && this.listOfCells[j][i+1].getColor() == ColorType.FIRE) {
                            updateTab[j][i+1] = new WhitePaint();
                        }

                    }
                    else {
                        updateTab[j][i] = new WhitePaint();
                    }
                }

            }
        }

    }

    public void mouveFF(Cell[][] updateTab) {
        List<FireFighter> updateFFList = new ArrayList<>();
        for(FireFighter fireFighter : this.fireFighters) {
            if(fireFighter.goalIsNull()) {
                fireFighter.findFire(updateTab);
                Cell fire = fireFighter.getFireGoal();
                if(fire != null) {
                    for(int i = 0; i < this.rowsNumber; i++) {
                        for (int j = 0; j < this.columnNumber; j++) {
                            if(fire == updateTab[j][i]) {
                                updateTab[j][i] = new FireFighterPaint();
                                updateTab[fireFighter.getColumn()][fireFighter.getRow()] = new WhitePaint();
                                updateFFList.add(new FireFighter(j, i));
                            }
                        }
                    }
                }

            }
        }
        this.fireFighters = updateFFList;
    }

    public void mouvFire(Cell[][] updateTab) {
        try {
            updateTab[0][0] = new FirePaint();
            for (int i = 0; i < this.rowsNumber; i++) {
                for (int j = 0; j < this.columnNumber; j++) {
                    if (i == 0 && j == 0 && updateTab[i][j].getColor() == ColorType.FIRE) {
                        if (updateTab[j + 1][i].getColor() == ColorType.NOTHING) updateTab[j + 1][i] = new FirePaint();
                        if (updateTab[j + 1][i + 1].getColor() == ColorType.NOTHING)
                            updateTab[j + 1][i + 1] = new FirePaint();
                        if (updateTab[j][i + 1].getColor() == ColorType.NOTHING) updateTab[j][i + 1] = new FirePaint();
                    } else if (i == 0 && j == 42 && updateTab[i][j].getColor() == ColorType.FIRE) {
                        if (updateTab[j - 1][i].getColor() == ColorType.NOTHING) updateTab[j - 1][i] = new FirePaint();
                        if (updateTab[j - 1][i + 1].getColor() == ColorType.NOTHING)
                            updateTab[j - 1][i + 1] = new FirePaint();
                        if (updateTab[j][i + 1].getColor() == ColorType.NOTHING) updateTab[j][i + 1] = new FirePaint();
                    } else if (i == 33 && j == 0 && updateTab[i][j].getColor() == ColorType.FIRE) {
                        if (updateTab[j + 1][i].getColor() == ColorType.NOTHING) updateTab[j + 1][i] = new FirePaint();
                        if (updateTab[j + 1][i - 1].getColor() == ColorType.NOTHING)
                            updateTab[j + 1][i - 1] = new FirePaint();
                        if (updateTab[j][i - 1].getColor() == ColorType.NOTHING) updateTab[j][i - 1] = new FirePaint();
                    } else if (i == 33 && j == 42 && updateTab[i][j].getColor() == ColorType.FIRE) {
                        if (updateTab[j - 1][i].getColor() == ColorType.NOTHING) updateTab[j - 1][i] = new FirePaint();
                        if (updateTab[j - 1][i - 1].getColor() == ColorType.NOTHING)
                            updateTab[j - 1][i - 1] = new FirePaint();
                        if (updateTab[j][i - 1].getColor() == ColorType.NOTHING) updateTab[j][i - 1] = new FirePaint();
                    } /*else if (i == 0) {
                    if(updateTab[j+1][i+1].getColor() == ColorType.NOTHING) updateTab[j+1][i+1] = new FirePaint();
                    if(updateTab[j][i+1].getColor() == ColorType.NOTHING) updateTab[j][i+1] = new FirePaint();
                    if(updateTab[j][i+1].getColor() == ColorType.NOTHING) updateTab[j][i+1] = new FirePaint();
                    if(updateTab[j-1][i].getColor() == ColorType.NOTHING) updateTab[j-1][i] = new FirePaint();
                    if(updateTab[j+1][i].getColor() == ColorType.NOTHING) updateTab[j+1][i] = new FirePaint();
                } else if (i == 33) {
                    if(updateTab[j+1][i].getColor() == ColorType.NOTHING) updateTab[j+1][i] = new FirePaint();
                    if(updateTab[j-1][i].getColor() == ColorType.NOTHING) updateTab[j-1][i] = new FirePaint();
                    if(updateTab[j+1][i-1].getColor() == ColorType.NOTHING) updateTab[j+1][i-1] = new FirePaint();
                    if(updateTab[j-1][i-1].getColor() == ColorType.NOTHING) updateTab[j-1][i-1] = new FirePaint();
                    if(updateTab[j][i-1].getColor() == ColorType.NOTHING) updateTab[j][i-1] = new FirePaint();
                } else if (j == 0) {
                    if(updateTab[j][i-1].getColor() == ColorType.NOTHING) updateTab[j][i-1] = new FirePaint();
                    if(updateTab[j][i+1].getColor() == ColorType.NOTHING) updateTab[j][i+1] = new FirePaint();
                    if(updateTab[j+1][i-1].getColor() == ColorType.NOTHING) updateTab[j+1][i-1] = new FirePaint();
                    if(updateTab[j+1][i].getColor() == ColorType.NOTHING) updateTab[j+1][i] = new FirePaint();
                    if(updateTab[j+1][i+1].getColor() == ColorType.NOTHING) updateTab[j+1][i+1] = new FirePaint();
                } else if (j == 42) {
                    if(updateTab[j][i-1].getColor() == ColorType.NOTHING) updateTab[j][i-1] = new FirePaint();
                    if(updateTab[j][i+1].getColor() == ColorType.NOTHING) updateTab[j][i+1] = new FirePaint();
                    if(updateTab[j-1][i-1].getColor() == ColorType.NOTHING) updateTab[j-1][i-1] = new FirePaint();
                    if(updateTab[j-1][i].getColor() == ColorType.NOTHING) updateTab[j-1][i] = new FirePaint();
                    if(updateTab[j-1][i+1].getColor() == ColorType.NOTHING) updateTab[j-1][i+1] = new FirePaint();
                } else {
                    if(updateTab[j][i-1].getColor() == ColorType.NOTHING) updateTab[j][i-1] = new FirePaint();
                    if(updateTab[j][i+1].getColor() == ColorType.NOTHING) updateTab[j][i+1] = new FirePaint();
                    if(updateTab[j+1][i].getColor() == ColorType.NOTHING) updateTab[j+1][i] = new FirePaint();
                    if(updateTab[j-1][i].getColor() == ColorType.NOTHING) updateTab[j-1][i] = new FirePaint();
                    if(updateTab[j+1][i+1].getColor() == ColorType.NOTHING) updateTab[j+1][i+1] = new FirePaint();
                    if(updateTab[j+1][i-1].getColor() == ColorType.NOTHING) updateTab[j+1][i-1] = new FirePaint();
                    if(updateTab[j-1][i+1].getColor() == ColorType.NOTHING) updateTab[j-1][i+1] = new FirePaint();
                    if(updateTab[j-1][i-1].getColor() == ColorType.NOTHING) updateTab[j+1][i+1] = new FirePaint();
                }*/

                }
            }
        } catch (Exception e) {

        }

    }







    public void restartGrid() {
        initGrid();
    }

    public Cell[][] getListOfCells() {
        return listOfCells;
    }

    public void setListOfCells(Cell[][] listOfCells) {
        this.listOfCells = listOfCells;
    }

    public void displayTab() {
        for(int i = 0; i < this.rowsNumber; i++) {
            for (int j = 0; j < this.columnNumber; j++) {
                System.out.print(this.listOfCells[j][i].getColor() + "\t " + i);
            }
            System.out.println();
        }
    }
}


