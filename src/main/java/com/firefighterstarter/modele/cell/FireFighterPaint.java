package com.firefighterstarter.modele.cell;

import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class FireFighterPaint extends Cell {

    private int numberOfFireFighter;


    public FireFighterPaint(List<Cell> listOfCells, int numberOfFireFighter) {
        super(listOfCells);
       this.listOfCells = listOfCells;
       this.numberOfFireFighter = numberOfFireFighter;
       init();
    }

    public void init() {

    }




}
