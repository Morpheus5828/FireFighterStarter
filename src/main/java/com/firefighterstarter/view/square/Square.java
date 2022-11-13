package com.firefighterstarter.view.square;

import javafx.scene.layout.Pane;

public class Square extends Pane {
    private int column;
    private int rows;
    private String color;

    public Square(int column, int rows, String color) {
        this.column = column;
        this.rows = rows;
        this.setStyle(color);
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

    public String getColor() {
        return this.getStyle();
    }

    public void setColor(String color) {
        this.setStyle(color);
    }
}
