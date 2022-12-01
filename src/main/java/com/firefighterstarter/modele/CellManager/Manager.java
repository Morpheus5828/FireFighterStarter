package com.firefighterstarter.modele.CellManager;

import com.firefighterstarter.modele.CellRepo.Cell;

public interface Manager {
    void initGrid();
    Cell[][] updateGrid();
    boolean isOver(Cell[][] updateTab);
    public Cell[][] getListOfCells();
    public boolean isEndGame();

}
