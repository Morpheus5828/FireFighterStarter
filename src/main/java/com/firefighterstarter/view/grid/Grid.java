package com.firefighterstarter.view.grid;

/*
    Create a grid with color square
*/

import com.firefighterstarter.view.square.Square;
import javafx.scene.Node;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;

import java.util.List;

public class Grid extends GridPane {

    private int width, height;
    private float columns, rows;
    private List<Pane> squares;

    public Grid(int width, int height, float columns, float rows) {
        this.width = width;
        this.height = height;
        this.columns = columns;
        this.rows = rows;

        drawGrid();
        createSquare();
        paintFire();

    }

    public void drawGrid() {
        for(int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(40);
            this.getColumnConstraints().add(column);
        }
        for(int i = 0; i < rows; i++) {
            RowConstraints row = new RowConstraints(40);
            this.getRowConstraints().add(row);
        }
    }

    void createSquare(){
        // by default all square are white
        for(int i = 0; i < 30; i++) {
            for(int j = 0 ; j < 30; j++) {
                this.add(new Square(i, j, "-fx-background-color: withe;"), i, j);
            }
        }
    }


    public void paintFF(int row, int col) {

    }

    public void paintFire() {
        int randomSquare = (int) (Math.random() * (300-1));
        this.getChildren().get(randomSquare).setStyle("-fx-background-color: red;");
    }









}
