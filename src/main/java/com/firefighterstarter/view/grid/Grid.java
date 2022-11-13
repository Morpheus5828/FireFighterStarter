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
        paintWay();
        paintFire();
        //paintFF();

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
        // by default all square are white and grid contains 30 square by rows and columns
        for(int i = 0; i < 30; i++) {
            for(int j = 0 ; j < 30; j++) {
                this.add(new Square(i, j, "-fx-background-color: withe;"), i, j);
            }
        }
    }


    public void paintFF() {
        int randomSquare = (int) (Math.random() * (400-1));
        this.getChildren().get(randomSquare).setStyle("-fx-background-color: grey;");
    }

    public void paintFire() {
        for(int i = 0; i < 200; i++) {
            int randomSquare = (int) (Math.random() * (900-1));
            if(this.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #a5632a;"))
                continue;
            this.getChildren().get(randomSquare).setStyle("-fx-background-color: red;");
        }
    }

    public void paintWay() {
        for(int i = 0; i < 300; i += 30)
            this.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
        for(int i = 300; i < 315; i += 1)
            this.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
        for(int i = 315; i < 900; i += 30)
            this.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
    }









}
