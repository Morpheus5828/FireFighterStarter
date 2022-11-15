package com.firefighterstarter.view.grid.paint;

import com.firefighterstarter.view.grid.GridColor;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class CloudPaint extends GridColor {
    List<Cloud> cloudNodes;
    private static class Cloud {
        private int position;
        public Cloud(int position) {
            this.position = position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public int getPosition() {
            return position;
        }
    }

    public CloudPaint(GridPane gridPane) {
        super(gridPane);
        this.cloudNodes = new ArrayList<>();
    }

    public void initPaint() {
        for(int i = 0; i < 50; i++) {
            int randomSquare = (int) (Math.random() * 1400);
            if(
                this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #a5632a;") ||
                this.gridPane.getChildren().get(randomSquare).getStyle().equals("-fx-background-color: #f3c9a2;")
            )
                continue;
            this.gridPane.getChildren().get(randomSquare).setStyle(CLOUD_COLOR);
            Cloud cloud = new Cloud(randomSquare);
            this.cloudNodes.add(cloud);
        }
    }

    public void mouveCloud() {
        deleteFire();

        for(Cloud cloudPosition : this.cloudNodes) {
            if(gridPane.getChildren().get(cloudPosition.getPosition()+33).getStyle().equals(WHITE_COLOR)) {
                gridPane.getChildren().get(cloudPosition.getPosition()+33).setStyle(CLOUD_COLOR);
                gridPane.getChildren().get(cloudPosition.getPosition()).setStyle(WHITE_COLOR);
            }

            if(1452 < cloudPosition.getPosition()+33)
                cloudPosition.setPosition(cloudPosition.getPosition()+33);
        }
    }

    private void deleteFire() {
        for(Cloud cloudPosition : this.cloudNodes) {
            Node fireNode = isFireCellNearCloud(cloudPosition);
            if (fireNode != null)
                fireNode.setStyle(WHITE_COLOR);
        }
    }

    private Node isFireCellNearCloud(Cloud cloudPosition) {
        if(this.gridPane.getChildren().get(cloudPosition.getPosition()+1).getStyle().equals(FIRE_COLOR))
            return this.gridPane.getChildren().get(cloudPosition.getPosition()+1);
        return null;
    }

    /*private void setCloudNodes(List<Integer> cloudNodes) {
        this.cloudNodes = cloudNodes;
    }*/
}
