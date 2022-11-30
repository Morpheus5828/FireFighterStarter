package com.firefighterstarter.modele.cell.Manager;

import com.firefighterstarter.modele.cell.*;
import com.firefighterstarter.modele.cell.FireFighter.FireFighter;
import com.firefighterstarter.modele.cell.FireFighter.FireFighterPaint;

import java.util.ArrayList;
import java.util.List;

public class PandemicCellMouvementManager {
    private Cell[][] listOfCells;
    private int columnNumber;
    private int rowsNumber;
    private List<Doctor> doctors;
    private final int numberOfDoctors = 20;
    private final int numberOfVirus = 40;
    private int peopleInfected = 0;
    private int peopleNotInfected = 100;
    private boolean endGame = false;

    public PandemicCellMouvementManager(int columnNumber, int rowsNumber) {
        this.listOfCells = new Cell[columnNumber][rowsNumber];
        this.columnNumber = columnNumber;
        this.rowsNumber = rowsNumber;
        this.doctors = new ArrayList<>();
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

    initDoctors();
    initPeople();
    initVirus();

    }

    public Cell[][] updateGrid() {
        Cell[][] updateTab = new Cell[columnNumber][rowsNumber];

        for(int i = 0; i < this.columnNumber; i++) {
            for(int j = 0; j < this.rowsNumber; j++) {
                updateTab[i][j] = this.listOfCells[i][j];
            }
        }

        mouveDoctor(updateTab);
        mouveVirus(updateTab);
        //mouvePeople(updateTab);

        return updateTab;
    }

    public void initDoctors() {
        for (int i = 0; i < numberOfDoctors; i++) {
            int randomColumn = (int) (Math.random() * columnNumber);
            int randomRow = (int) (Math.random() * rowsNumber);
            Cell currentCell = listOfCells[randomColumn][randomRow];
            if (currentCell.getColor() == ColorType.NOTHING) {
                Cell doctor = new DoctorPaint();
                this.listOfCells[randomColumn][randomRow] = doctor;
                this.doctors.add(new Doctor(randomColumn, randomRow));
            }
        }
    }

    public void initVirus() {
        for (int i = 0; i < numberOfVirus; i++) {
            int randomColumn = (int) (Math.random() * columnNumber);
            int randomRow = (int) (Math.random() * rowsNumber);
            Cell currentCell = listOfCells[randomColumn][randomRow];
            if (currentCell.getColor() == ColorType.NOINFECTED) {
                Cell virus = new PeopleInfectedPaint();
                this.listOfCells[randomColumn][randomRow] = virus;
            }
        }
    }

    public void initPeople() {
        for (int i = 0; i < peopleNotInfected; i++) {
            int randomColumn = (int) (Math.random() * columnNumber);
            int randomRow = (int) (Math.random() * rowsNumber);
            Cell currentCell = listOfCells[randomColumn][randomRow];
            if (currentCell.getColor() == ColorType.NOTHING) {
                Cell people = new PeopleNotInfectedPaint();
                this.listOfCells[randomColumn][randomRow] = people;
            }
        }
    }

    public void mouveDoctor(Cell[][] updateTab) {

    }

    public void mouveVirus(Cell[][] updateTab) {

        try {
            int i;
            int j;
            for (i = 0; i < this.rowsNumber; i++) {
                for (j = 0; j < this.columnNumber; j++) {
                    if(this.listOfCells[j][i].getColor() == ColorType.NOINFECTED) {
                        if (i == 0 && j == 0) {
                            if (
                                    this.listOfCells[j + 1][i].getColor() == ColorType.NOINFECTED
                            ) updateTab[j + 1][i] = new PeopleInfectedPaint();
                            if (
                                    this.listOfCells[j + 1][i + 1].getColor() == ColorType.NOTHING
                            ) updateTab[j + 1][i + 1] = new PeopleInfectedPaint();

                            if (
                                    this.listOfCells[j][i + 1].getColor() == ColorType.NOINFECTED
                            ) updateTab[j][i + 1] = new PeopleInfectedPaint();
                        }
                        else if (i == 32 && j == 0) {
                            if (
                                    this.listOfCells[j+1][i].getColor() == ColorType.NOINFECTED
                            ) updateTab[j+1][i] = new PeopleInfectedPaint();
                            if (
                                    this.listOfCells[j+1][i-1].getColor() == ColorType.NOINFECTED
                            ) updateTab[j+1][i-1] = new PeopleInfectedPaint();
                            if (
                                    this.listOfCells[j][i-1].getColor() == ColorType.NOINFECTED
                            ) updateTab[j][i-1] = new PeopleInfectedPaint();
                        }
                        else if (i == 0 && j == 43) {
                            if (
                                    this.listOfCells[j-1][i].getColor() == ColorType.NOINFECTED
                            ) updateTab[j-1][i] = new PeopleInfectedPaint();
                            if (
                                    this.listOfCells[j-1][i+1].getColor() == ColorType.NOINFECTED
                            ) updateTab[j-1][i+1] = new PeopleInfectedPaint();
                            if (
                                    this.listOfCells[j][i+1].getColor() == ColorType.NOINFECTED
                            ) updateTab[j][i+1] = new PeopleInfectedPaint();
                        }
                        else if (i == 32 && j == 43) {
                            if (
                                    this.listOfCells[j-1][i].getColor() == ColorType.NOINFECTED
                            ) updateTab[j-1][i] = new PeopleInfectedPaint();
                            if (
                                    this.listOfCells[j-1][i-1].getColor() == ColorType.NOINFECTED
                            ) updateTab[j-1][i-1] = new PeopleInfectedPaint();
                            if (
                                    this.listOfCells[j][i-1].getColor() == ColorType.NOINFECTED
                            ) updateTab[j][i-1] = new PeopleInfectedPaint();
                        }

                        else if (i == 0) {
                            if (this.listOfCells[j+1][i+1].getColor() == ColorType.NOINFECTED)
                                updateTab[j+1][i+1] = new PeopleInfectedPaint();
                            if (this.listOfCells[j-1][i+1].getColor() == ColorType.NOINFECTED)
                                updateTab[j-1][i+1] = new PeopleInfectedPaint();
                        }
                        else if (j == 0) {
                            if (this.listOfCells[j][i-1].getColor() == ColorType.NOINFECTED)
                                updateTab[j][i-1] = new PeopleInfectedPaint();
                            if (this.listOfCells[j][i+1].getColor() == ColorType.NOINFECTED)
                                updateTab[j][i+1] = new PeopleInfectedPaint();

                        }
                        else if(j == 43) {
                            if (this.listOfCells[j][i-1].getColor() == ColorType.NOINFECTED)
                                updateTab[j][i-1] = new PeopleInfectedPaint();
                            if (this.listOfCells[j][i+1].getColor() == ColorType.NOINFECTED)
                                updateTab[j][i+1] = new PeopleInfectedPaint();
                        }
                        else if(i == 32) {
                            if (this.listOfCells[j+1][i].getColor() == ColorType.NOINFECTED)
                                updateTab[j+1][i] = new PeopleInfectedPaint();
                            if (this.listOfCells[j-1][i].getColor() == ColorType.NOINFECTED)
                                updateTab[j-1][i] = new PeopleInfectedPaint();
                        }

                        else {
                            if (this.listOfCells[j+1][i].getColor() == ColorType.NOINFECTED)
                                updateTab[j+1][i] = new PeopleInfectedPaint();
                            if (this.listOfCells[j][i-1].getColor() == ColorType.NOINFECTED)
                                updateTab[j][i-1] = new PeopleInfectedPaint();
                        }
                    }


                }
            }
        } catch (Exception e) {

        }
    }

    public void mouvePeople() {

    }

    public Cell[][] getListOfCells() {
        return listOfCells;
    }

    public void setListOfCells(Cell[][] listOfCells) {
        for(int i = 0; i < this.columnNumber; i++)
            if (this.rowsNumber >= 0) System.arraycopy(listOfCells[i], 0, this.listOfCells[i], 0, this.rowsNumber);
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public boolean isEndGame() {
        return endGame;
    }



}
