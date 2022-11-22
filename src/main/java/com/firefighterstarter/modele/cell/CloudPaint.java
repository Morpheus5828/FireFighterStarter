package com.firefighterstarter.view.grid.paint;

import com.firefighterstarter.view.grid.CellMouvementManager;
import com.firefighterstarter.view.grid.GridColor;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class CloudPaint extends GridColor implements Runnable {
    private List<Integer> cloudNodes;
    private boolean threadIsRunnable;

    public CloudPaint(GridPane gridPane) {
        super(gridPane);
        this.cloudNodes = new ArrayList<>();
        this.threadIsRunnable = false;
    }

    public void initPaint() {

        for(int i = 0; i < 50; i++) {
            int randomSquare = (int) (Math.random() * 1452);
            if(
                this.gridPane.getChildren().get(randomSquare).getStyle().equals(WAY_COLOR) ||
                this.gridPane.getChildren().get(randomSquare).getStyle().equals(MOUNTAIN_COLOR)
            ) {
                continue;
            }
            else {
                this.gridPane.getChildren().get(randomSquare).setStyle(CLOUD_COLOR);
                this.cloudNodes.add(randomSquare);
            }

        }
    }

    @Override
    public void run() {
        deleteFire();
        List<Integer> nextCell = new ArrayList<>();
        for(int cloudPosition : this.cloudNodes) {
            if(cloudPosition >= 1409) {
                gridPane.getChildren().get(cloudPosition).setStyle(WHITE_COLOR);
                continue;
            }
            if(cloudPosition+33 < 1452) {
                if(
                    // if right cell of cloud cell is white or red, it can move itself
                        gridPane.getChildren().get(cloudPosition + 33).getStyle().equals(WHITE_COLOR) ||
                        gridPane.getChildren().get(cloudPosition + 33).getStyle().equals(FIRE_COLOR)

                ) {
                    gridPane.getChildren().get(cloudPosition +33).setStyle(CLOUD_COLOR);
                    gridPane.getChildren().get(cloudPosition).setStyle(WHITE_COLOR);
                    nextCell.add(cloudPosition+33);
                    CellMouvementManager.fireQuantity -= 1;
                }

            }
        }
        this.cloudNodes = nextCell;

        //if touch the right grid, cloud disappear
    }



    private void deleteFire() {
        for(Integer cloudPosition : this.cloudNodes) {
            Node fireNode = isFireCellNearCloud(cloudPosition);
            if (fireNode != null)
                fireNode.setStyle(WHITE_COLOR);
        }
    }

    private Node isFireCellNearCloud(int cloudPosition) {
        if(this.gridPane.getChildren().get(cloudPosition+1).getStyle().equals(FIRE_COLOR))
            return this.gridPane.getChildren().get(cloudPosition+1);
        return null;
    }


    /*private void setCloudNodes(List<Integer> cloudNodes) {
        this.cloudNodes = cloudNodes;
    }*/
}
