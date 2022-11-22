package com.firefighterstarter.modele.cell;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class CellMouvementManager {
    private GridPane gridPane;
    private FirePaint firePaint;
    private CloudPaint cloudPaint;
    private FireFighterPaint fireFighterPaint;
    private WayPaint wayPaint;
    private MountainPaint mountainPaint;
    public static int fireQuantity;
    private Thread cloudThread;
    private Thread fireFighterThread;

    public CellMouvementManager(GridPane gridPane) {
        this.gridPane = gridPane;
        this.firePaint = new FirePaint(this.gridPane);
        this.cloudPaint = new CloudPaint(this.gridPane);
        this.wayPaint = new WayPaint(this.gridPane);
        this.mountainPaint = new MountainPaint(this.gridPane);
        this.fireFighterPaint = new FireFighterPaint(this.gridPane);
        fireQuantity = this.firePaint.getNumberOfFire();
    }

    public void initGrid() {
        for(Node node : gridPane.getChildren())
            node.setStyle("-fx-background-color: white;");
        this.wayPaint.initPaint();
        this.mountainPaint.initPaint();
        this.fireFighterPaint.initPaint();
        this.cloudPaint.initPaint();
        this.firePaint.initPaint();
        fireQuantity = 200;
    }

    public void updateGrid() {
        if(fireQuantity > 150) {  // TODO replace 150 by 0 when fireFighter can move in the grid themself
            System.out.println(fireQuantity);
            cloudThread = new Thread(this.cloudPaint);
            fireFighterThread = new Thread(this.fireFighterPaint);
            fireFighterThread.start();
            cloudThread.start();
        }
        else {
            //game finished
            System.out.println("FINISHED");
            fireFighterThread.interrupt();
            cloudThread.interrupt();

        }
    }

    public void restartGrid() {
        for(Node node : gridPane.getChildren())
            node.setStyle("-fx-background-color: white;");
    }

}
