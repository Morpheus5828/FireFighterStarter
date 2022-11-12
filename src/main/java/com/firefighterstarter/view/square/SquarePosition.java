package com.firefighterstarter.view.square;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SquarePosition {
    private List<Square> fireFighters;
    private Set<Square> fires;
    private List<Square> fireFighterNewPosition;

    public SquarePosition() {
        this.fireFighters = new ArrayList<>();
        this.fires = new HashSet<>();
        this.fireFighterNewPosition = new ArrayList<>();
    }
}
