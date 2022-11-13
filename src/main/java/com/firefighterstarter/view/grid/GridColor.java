package com.firefighterstarter.view.grid;

/*
    Create a grid with color square
*/

import com.firefighterstarter.view.grid.paint.*;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public abstract class GridColor {
    protected final String CLOUD_COLOR = "-fx-background-color: #706969;";
    protected final String FIRE_COLOR = "-fx-background-color: red;";
    protected final String WHITE_COLOR = "-fx-background-color: white;";
    protected GridPane gridPane;

    public GridColor(GridPane gridPane) {
        this.gridPane = gridPane;
    }

    protected abstract void paint();

    public void initialise() {
        new WayPaint(this.gridPane);
        new MountainPaint(this.gridPane);
        new CloudPaint(this.gridPane);
        new FirePaint(this.gridPane);
        new FireFighterPaint(this.gridPane);
    }

    public void paintReset() {
        for(Node node : gridPane.getChildren())
            node.setStyle("-fx-background-color: white;");
    }



    public void run() {
        for(int nodeIndex = 0; nodeIndex < this.gridPane.getChildren().size(); nodeIndex++) {
            // if cloud are overhead fire, it's end
            if(this.gridPane.getChildren().get(nodeIndex).getStyle().equals(CLOUD_COLOR)) {
                if(this.gridPane.getChildren().get(nodeIndex + 1).getStyle().equals(FIRE_COLOR)) {
                    this.gridPane.getChildren().get(nodeIndex +1).setStyle(WHITE_COLOR);
                }

                if(this.gridPane.getChildren().get(nodeIndex + 2).getStyle().equals(FIRE_COLOR)) {
                    this.gridPane.getChildren().get(nodeIndex +2).setStyle(WHITE_COLOR);
                }


            }
        }
    }




}
