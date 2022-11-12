package com.firefighterstarter.view.grid;

/*
    Create a grid with color square
*/

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public abstract class Grid extends Canvas {
    protected int width, height;
    protected float columnCounter, rowCounter;


    public Grid(int width, int height, int columnCounter, int rowCounter) {
        super(width, height);
        this.width = width;
        this.height = height;
        this.columnCounter = columnCounter;
        this.rowCounter = rowCounter;
    }

    public void initialise() {

    }


}
