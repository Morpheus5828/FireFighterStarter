package com.firefighterstarter.modele.cell;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class CellMouvementManager {
    private List<Cell> listOfCells;
    private int lenght;

    public CellMouvementManager(int length) {
        this.listOfCells = new ArrayList<>();
        this.lenght = length;
    }

    public void initGrid() {
        for(int i = 0; i < this.lenght; i++)
            this.listOfCells.add(new WhitePaint(Color.WHITE));
    }

    public void updateGrid() {
        // mouve each cell with conditions
    }

    public void restartGrid() {
        initGrid();
    }


    public List<Cell> getListOfCells() {
        return listOfCells;
    }
}
