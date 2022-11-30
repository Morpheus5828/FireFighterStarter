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
    private static boolean initVirusInstance = true;

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

    }

    public Cell[][] updateGrid() {
        Cell[][] updateTab = new Cell[columnNumber][rowsNumber];

        for(int i = 0; i < this.columnNumber; i++) {
            for(int j = 0; j < this.rowsNumber; j++) {
                updateTab[i][j] = this.listOfCells[i][j];
            }
        }

        if(initVirusInstance) {
            initVirus(updateTab);
            initVirusInstance = false;
        }

        mouveDoctor(updateTab);
        mouveVirus(updateTab);
        mouvePeople(updateTab);

        if(isOver(updateTab))
            endGame = true;

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

    public void initVirus(Cell[][] updateTab) {
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            if(counter == numberOfVirus)
                return;
            int randomColumn = (int) (Math.random() * columnNumber);
            int randomRow = (int) (Math.random() * rowsNumber);
            Cell currentCell = this.listOfCells[randomColumn][randomRow];
            if (currentCell.getColor() == ColorType.NOINFECTED) {
                counter += 1;
                Cell virus = new PeopleInfectedPaint();
                updateTab[randomColumn][randomRow] = virus;
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
        List<Doctor> updateDoctorList = new ArrayList<>();
        for(Doctor doctor : this.doctors) {
            doctor.findVirus(updateTab);

            if(!doctor.goalIsNull()) {
                updateTab[doctor.getColumn()][doctor.getRow()] = new PeopleNotInfectedPaint();

                updateTab[doctor.getVirusGoal().getColumn()][doctor.getVirusGoal().getRow()] = new PeopleNotInfectedPaint();

                updateDoctorList.add(new Doctor(doctor.getVirusGoal().getColumn(),doctor.getVirusGoal().getRow()));
            }

            else {
                doctor.resetGoal();
                updateDoctorList.add(doctor);
            }
        }
        setDoctors(updateDoctorList);
    }

    public void mouveVirus(Cell[][] updateTab) {
        try {
            int i;
            int j;
            for (i = 0; i < this.rowsNumber; i++) {
                for (j = 0; j < this.columnNumber; j++) {
                    if(updateTab[j][i].getColor() == ColorType.INFECTED) {
                        if (i == 0 && j == 0) {
                            if (
                                    this.listOfCells[j + 1][i].getColor() == ColorType.NOINFECTED
                            ) updateTab[j + 1][i] = new PeopleInfectedPaint();
                            if (
                                    this.listOfCells[j + 1][i + 1].getColor() == ColorType.NOINFECTED
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
           // e.printStackTrace();
            //System.out.println("erreur i :" + i + " j : " + j);
        }
    }

    public void mouvePeople(Cell[][] updateTab) {
        for (int i = 0; i < this.rowsNumber; i++) {
            for (int j = 0; j < this.columnNumber; j++) {
                if(this.listOfCells[j][i].getColor() == ColorType.INFECTED) {
                    People people = new People(j, i);
                    people.findEmptyPlace(updateTab);

                    if(!people.emptyPlace()) {
                        //updateTab[people.getColumn()][people.getRow()] = new WhitePaint();

                        if(listOfCells[j][i].getColor() == ColorType.INFECTED)
                            updateTab[people.getEmptyPlace().getColumn()][people.getEmptyPlace().getRow()] = new PeopleInfectedPaint();
                    }

                }
                if(this.listOfCells[j][i].getColor() == ColorType.NOINFECTED) {
                    People people = new People(j, i);
                    people.findEmptyPlace(updateTab);

                    if(!people.emptyPlace()) {
                        //updateTab[people.getColumn()][people.getRow()] = new WhitePaint();

                        if(listOfCells[j][i].getColor() == ColorType.NOINFECTED)
                            updateTab[people.getEmptyPlace().getColumn()][people.getEmptyPlace().getRow()] = new PeopleInfectedPaint();
                    }

                }
            }
        }

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

    public boolean isOver(Cell[][] updateTab) {
        int counter = 0;
        for(int i = 0; i < this.columnNumber; i++) {
            for (int j = 0; j < this.rowsNumber; j++) {
                if(updateTab[i][j].getColor() == ColorType.INFECTED)
                    counter++;
            }
        }
        return counter == 0;
    }

}
