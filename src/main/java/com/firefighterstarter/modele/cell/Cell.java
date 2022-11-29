package com.firefighterstarter.modele.cell;

import java.util.List;

public abstract class Cell {
    private int column = -1;
    private int row = -1;

    protected ColorType colorType;

    public ColorType getColor() {
        return this.colorType;
    };

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
