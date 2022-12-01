package com.firefighterstarter.modele.CellRepo.Attacking;

public interface Attacking {
    int getColumn();
    void setColumn(int column);
    int getRow();
    void setRow(int row);
    boolean goalIsNull();
    String toString();
}
