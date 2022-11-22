package com.firefighterstarter.modele.cell;

import java.util.List;

public class Cell {
    protected ColorType colorType;
    protected List<Cell> listOfCells;

    public Cell(List<Cell> listOfCells) {
        this.listOfCells = listOfCells;
        this.colorType = ColorType.NOTHING;
    }

    public ColorType getColor() {
        return this.colorType;
    };

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }
}
