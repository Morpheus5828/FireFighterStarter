package com.firefighterstarter.modele.cell.FireFighter;

import com.firefighterstarter.modele.cell.Cell;
import com.firefighterstarter.modele.cell.ColorType;
import com.firefighterstarter.modele.cell.WhitePaint;

import java.util.ArrayList;
import java.util.List;

public class FireFighter {
    private Cell fireGoal;
    private int distance;
    private int column;
    private int row;

    public FireFighter(int column, int row) {
        this.distance = 3;
        this.fireGoal = null;
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Cell getFireGoal() {
        return fireGoal;
    }

    public void findFire(Cell[][] listOfCells) {
        try {
            while(goalIsNull()) {
                if(distance == 4)
                    break;
                for(int i = 0; i < distance; i++) {
                    if(this.row == 0 && this.column == 0) {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    return;
                                }
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }
                                if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+k];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    return;
                                }
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k-1];
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+k];
                                    return;
                                }
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    return;
                                }
                                if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+1];
                                    return;
                                }
                                if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+k];
                                    return;
                                }
                                if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+k];
                                    return;
                                }
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }

                            }
                        }

                    } else if (this.row == 0 && this.column == 43) {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }
                                if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column-k+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }
                                if(listOfCells[column][row+k-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }
                                if(listOfCells[column-k+1][row-k+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    return;
                                }
                                if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    return;
                                }
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }
                                if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    return;
                                }
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }
                                if(listOfCells[column-k][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }

                            }
                        }

                    } else if (this.row == 33 && this.column == 0) {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    return;
                                }
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    return;
                                }
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-k];
                                    return;
                                }
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    return;
                                }
                                if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-k];
                                    return;
                                }
                                if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-k];
                                    return;
                                }

                            }
                        }

                    } else if (this.row == 33 && this.column == 43) {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }

                                if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    return;
                                }
                                if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-k];
                                    return;
                                }
                                if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-k];
                                    return;
                                }
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }
                                if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-1];
                                    return;
                                }


                            }
                        }

                        // case ff is on the left side
                    } else if (this.column == 0) {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    return;
                                }
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    return;
                                }
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                                //
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }
                                if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+k];
                                    return;
                                }
                                if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+k];
                                    return;
                                }
                                if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+1];
                                    return;
                                }
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    return;
                                }
                                if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-1];
                                    return;
                                }
                                if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-k];
                                    return;
                                }
                                if(listOfCells[column+1][row-2].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-2];
                                    return;
                                }
                                if(listOfCells[column][row-2].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-2];
                                    return;
                                }

                            }
                        }

                        // case ff is on the right side
                    } else if (this.column == 43) {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    return;
                                }
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    return;
                                }
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                                if(listOfCells[column-1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+1];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                //
                                if(listOfCells[column-k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row+k];
                                    return;
                                }
                                if(listOfCells[column-k][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row+1];
                                    return;
                                }
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }
                                if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-1];
                                    return;
                                }
                                if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    return;
                                }
                                if(listOfCells[column-1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+k];
                                    return;
                                }
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }
                                if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-k];
                                    return;
                                }
                                if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-k];
                                    return;
                                }

                            }
                        }

                        // case ff is on the bottom side
                    } else if (this.row == 0) {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    return;
                                }
                                //
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    return;
                                }
                                if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+1];
                                    return;
                                }
                                if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+k];
                                    return;
                                }
                                if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+k];
                                    return;
                                }
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }
                                if(listOfCells[column-1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+k];
                                    return;
                                }
                                if(listOfCells[column-k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row+k];
                                    return;
                                }
                                if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-1];
                                    return;
                                }
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }

                            }
                        }

                        // case ff is in downside
                    } else if (this.row == 33) {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                //
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    return;
                                }
                                if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-1];
                                    return;
                                }
                                if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-k];
                                    return;
                                }
                                if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-k];
                                    return;
                                }
                                if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-k];
                                    return;
                                }
                                if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-k];
                                    return;
                                }
                                if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    return;
                                }
                                if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-1];
                                    return;
                                }
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }



                            }
                        }
                    }

                    else {
                        for(int k = 1 ; k < distance; k++) {
                            if(k == 1) {
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+1];
                                    return;
                                }
                                if(listOfCells[column-1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+1];
                                    return;
                                }
                            }
                            else {
                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    return;
                                }
                                if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    return;
                                }
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    return;
                                }
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+1];
                                    return;
                                }
                                if(listOfCells[column-1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+1];
                                    return;
                                }
                                //
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    return;
                                }
                                if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-1];
                                    return;
                                }
                                if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-k];
                                    return;
                                }
                                if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-k];
                                    return;
                                }
                                if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-k];
                                    return;
                                }
                                if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-k];
                                    return;
                                }
                                if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    return;
                                }
                                if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-1];
                                    return;
                                }
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }
                                //
                                if(listOfCells[column-k][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row+1];
                                    return;
                                }
                                if(listOfCells[column-k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row+k];
                                    return;
                                }
                                if(listOfCells[column-1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    return;
                                }

                                if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+k];
                                    return;
                                }
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    return;
                                }
                                if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+1];
                                    return;
                                }
                                if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+k];
                                    return;
                                }


                            }
                        }
                    }
                }
                distance += 1;

            }
        } catch (Exception e) {

        }
    }

    public boolean goalIsNull() {
        return this.fireGoal == null;
    }

    public void killFire() {
        System.out.println(this.fireGoal);
    }




}
