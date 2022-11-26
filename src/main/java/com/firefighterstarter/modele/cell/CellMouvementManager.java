package com.firefighterstarter.modele.cell;

import com.firefighterstarter.modele.cell.FireFighter.FireFighterPaint;

import java.util.ArrayList;
import java.util.List;

public class CellMouvementManager {
    private Cell[][] listOfCells;
    private int column;
    private int rows;
    private final int numberOfCloud = 20;
    private final int numberOfMountainGroup = 6;
    private final int numberOfFire = 100;
    private final int numberOfFireFighter = 10;

    private FireFighterPaint fireFighterPaint;
    private FirePaint firePaint;
    private MountainPaint mountainPaint;
    private WayPaint wayPaint;
    private CloudPaint cloudPaint;
    private WhitePaint whitePaint;

    public CellMouvementManager(int column, int rows) {
        this.column = column;
        this.rows = rows;
        this.listOfCells = new Cell[column][rows];
        initGrid();
    }

    public void initGrid() {
        for(int i = 0; i < this.column; i++) {
            for(int j = 0; j < this.rows; j++) {
                Cell cell = new Cell(listOfCells, column, rows);
                this.listOfCells[i][j] = cell;
            }
        }

        this.firePaint = new FirePaint(listOfCells, numberOfFire, column, rows);
        this.mountainPaint = new MountainPaint(listOfCells, numberOfMountainGroup, column, rows);
        this.fireFighterPaint = new FireFighterPaint(listOfCells, numberOfFireFighter, column, rows);
        this.cloudPaint = new CloudPaint(listOfCells, numberOfCloud, column, rows);
        this.wayPaint = new WayPaint(listOfCells, column, rows);
        this.whitePaint = new WhitePaint(listOfCells, column, rows);

        cloudPaint.initCloud(); // must be the first one to be init
        //fireFighterPaint.();
        //mountainPaint.initMountain();
        //cloudPaint.initCloud();
        //firePaint.initFire();
    }

    public void updateGrid() {
        cloudPaint.mouveCloud();
        //fireFighterPaint.mouveFireFighter();

    }

    public void restartGrid() {
     //   initGrid();
    }


    public Cell[][] getListOfCells() {
        return cloudPaint.getClouds();
    }


}
