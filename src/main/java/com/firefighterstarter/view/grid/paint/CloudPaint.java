package com.firefighterstarter.view.grid.paint;

import com.firefighterstarter.view.grid.GridColor;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class CloudPaint extends GridColor {
    List<Integer> cloudNodes;

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
            this.cloudNodes.add(randomSquare);
        }
    }

    public void mouveCloud() {
        deleteFire();
        for(int cloudPosition : this.cloudNodes) {
            // if neighbours cell is white mouve on cloud
            if(this.gridPane.getChildren().get(cloudPosition+1).getStyle().equals(WHITE_COLOR)) {
                this.gridPane.getChildren().get(cloudPosition).setStyle(WHITE_COLOR);
                this.gridPane.getChildren().get(cloudPosition+33).setStyle(CLOUD_COLOR);
            }
        }
    }

    private void deleteFire() {
        for(int cloudPosition : this.cloudNodes) {
            Node fireNode = isFireCellNearCloud(cloudPosition);
            if (fireNode != null)
                fireNode.setStyle("-fx-background-color: white;");
        }
    }

    private Node isFireCellNearCloud(int cloudPosition) {
        if(this.gridPane.getChildren().get(cloudPosition+1).getStyle().equals(FIRE_COLOR))
            return this.gridPane.getChildren().get(cloudPosition+1);
        return null;
    }
}
