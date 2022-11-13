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

public class Grid {
    private GridPane gridPane;

    public Grid(GridPane gridPane) {
        this.gridPane = gridPane;
    }

    public void initialise() {
        paintWay();
        paintMountains();
        paintCloud();
        paintFire();
        paintFF();
    }

    public void paintReset() {
        for(Node node : gridPane.getChildren())
            node.setStyle("-fx-background-color: white;");
    }

    private void paintWay() {
        for(int i = 0; i < 5; i++)
            gridPane.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
        for(int i = 37; i < 400; i += 33)
            gridPane.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
        for(int i = 400; i < 415; i++)
            gridPane.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");
        for(int i =415; i < 800; i += 33)
            gridPane.getChildren().get(i).setStyle("-fx-background-color: #a5632a;");

    }

    private void paintFF() {
        for(int i = 0; i < 1000; i++) {
            int randomNumber = (int) (Math.random() * 10);
            if(i != 0) {
                if(randomNumber % 5 == 0) {
                    if(this.gridPane.getChildren().get(i).getStyle().equals("-fx-background-color: #a5632a;"))
                        this.gridPane.getChildren().get(i).setStyle("-fx-background-color: black;");
                }
            }

        }
    }

    private void paintFire() {
        for(int i = 0; i < 200; i++) {
            int randomSquare = (int) (Math.random() * 1400);
            // if square is cloud or way, don't paint a fire
            if(this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #a5632a;") ||
                this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #706969;") ||
                this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #f3c9a2;")
            )
                continue;
            this.gridPane.getChildren().get(randomSquare).setStyle("-fx-background-color: red;");
        }
    }

    private void paintCloud() {
        for(int i = 0; i < 50; i++) {
            int randomSquare = (int) (Math.random() * 1400);
            if(this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #a5632a;") ||
                this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #f3c9a2;")
            )
                continue;
            this.gridPane.getChildren().get(randomSquare).setStyle("-fx-background-color: #706969;");
        }
    }

    private void paintMountains() {
        for(int i = 0; i < 10; i++) {
            int randomSquare = (int) (Math.random() * 1400);
            if(
                this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #a5632a;") ||
                this.gridPane.getChildren().get(randomSquare+1).getStyle().equals("-fx-background-color: #a5632a;") ||
                this.gridPane.getChildren().get(randomSquare+33).getStyle().equals("-fx-background-color: #a5632a;") ||
                this.gridPane.getChildren().get(randomSquare+34).getStyle().equals("-fx-background-color: #a5632a;")
            )
                continue;
            this.gridPane.getChildren().get(randomSquare).setStyle("-fx-background-color: #f3c9a2;");
            this.gridPane.getChildren().get(randomSquare+1).setStyle("-fx-background-color: #f3c9a2;");
            this.gridPane.getChildren().get(randomSquare+33).setStyle("-fx-background-color: #f3c9a2;");
            this.gridPane.getChildren().get(randomSquare+34).setStyle("-fx-background-color: #f3c9a2;");
        }
    }









}
