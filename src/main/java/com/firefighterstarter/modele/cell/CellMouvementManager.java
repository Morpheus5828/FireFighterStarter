package com.firefighterstarter.modele.cell;

import com.firefighterstarter.controller.Controller;

import java.util.ArrayList;
import java.util.List;

public class CellMouvementManager {
    private List<Cell> listOfCells;
    private int lenght;
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

    public CellMouvementManager(int length) {
        this.listOfCells = new ArrayList<>();
        this.lenght = length;
        this.firePaint = new FirePaint(this.listOfCells, numberOfFire);
        this.mountainPaint = new MountainPaint(this.listOfCells, numberOfMountainGroup);
        this.fireFighterPaint = new FireFighterPaint(this.listOfCells, numberOfFireFighter);
        this.cloudPaint = new CloudPaint(this.listOfCells, numberOfCloud);
        this.wayPaint = new WayPaint(this.listOfCells);
        this.whitePaint = new WhitePaint(this.listOfCells);

        initGrid();
    }

    public void initGrid() {
        for(int i = 0; i < this.lenght; i++) {
            Cell cell = new Cell(listOfCells);
            cell.setColorType(ColorType.NOTHING);
            this.listOfCells.add(cell);
        }
    }

    public void updateGrid() {
        // mouve each cell with conditions
        if(Controller._click == 0) {
            wayPaint.initWay(); // must be the first one to be init
            fireFighterPaint.initFireFighter();
            mountainPaint.initMountain();
            cloudPaint.initCloud();
            firePaint.initFire();
        } else {
            cloudPaint.mouveCloud();
        }
    }

    public void restartGrid() {
        initGrid();
    }


    public List<Cell> getListOfCells() {
        return listOfCells;
    }


}
