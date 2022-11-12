package com.firefighterstarter.view.square;

public class Square {
    private int column;
    private int rows;

    public Square(int column, int rows) {
        this.column = column;
        this.rows = rows;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
