package com.firefighterstarter.modele.cell;

import java.util.List;

public class Cell {
    protected ColorType colorType;
    protected Cell[][] listOfCells;
    protected final int gridColumn;
    protected final int gridRows;

    public Cell(Cell[][]listOfCells, int gridRows, int gridColumn) {
        this.gridRows = gridRows;
        this.gridColumn = gridColumn;
        this.colorType = ColorType.NOTHING;
        this.listOfCells = listOfCells;
    }

    public ColorType getColor() {
        return this.colorType;
    };

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public void setListOfCells(Cell[][] listOfCells) {
        this.listOfCells = listOfCells;
    }
}
