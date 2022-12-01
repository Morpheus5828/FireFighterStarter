package com.firefighterstarter.modele.CellRepo.Attacking;

import com.firefighterstarter.modele.CellRepo.Goal.ColorType;
import com.firefighterstarter.modele.CellRepo.Cell;

public class Doctor implements Attacking{
    private Cell virusGoal;
    private int distance;
    private int column;
    private int row;

    public Doctor(int column, int row) {
        this.distance = 3;
        this.virusGoal = null;
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

    public Cell getVirusGoal() {
        return virusGoal;
    }

    public void findVirus(Cell[][] listOfCells) {
        try {
            while(goalIsNull()) {
                int i;
                int k;
                if(distance == 4)
                    return;
                for(i = 0; i < distance; i++) {
                    if(this.row == 0 && this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column+1][row].getColor() == ColorType.INFECTED) {
                                this.virusGoal = listOfCells[column+1][row];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row);
                                return;
                            }

                            if(listOfCells[column][row+1].getColor() == ColorType.INFECTED) {
                                this.virusGoal = listOfCells[column][row+1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.INFECTED) {
                                this.virusGoal = listOfCells[column+1][row+1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.INFECTED) {
                                this.virusGoal = listOfCells[column+k][row];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.INFECTED) {
                                this.virusGoal = listOfCells[column+k][row+1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.INFECTED) {
                                this.virusGoal = listOfCells[column+k][row+k];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.INFECTED) {
                                this.virusGoal = listOfCells[column+1][row+k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.INFECTED) {
                                this.virusGoal = listOfCells[column][row+k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+k);
                                return;
                            }


                        }

                    }
                    else if (this.row == 0 && this.column == 43) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row+1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row-1];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row-k];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row+k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row+k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row+1];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                        }

                    }

                    else if (this.row == 32 && this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row-k];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row-1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-k);
                                return;
                            }


                        }

                    }

                    else if (this.row == 32 && this.column == 43) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row-1];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row);
                                return;
                            }

                            if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row-k];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row-k];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row-1];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }



                        }

                        // case ff is on the left side
                    }

                    else if (this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row+1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row+1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            //
                            if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row+k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row+k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row+k];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row+1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row-1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row-k];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-k);
                                return;
                            }

                        }

                        // case ff is on the right side
                    }

                    else if (this.column == 43) {
                        for (k = 1; k < distance; k++) {
                            if (listOfCells[column][row + 1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row + 1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if (listOfCells[column][row - 1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row - 1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if (listOfCells[column - 1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - 1][row];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if (listOfCells[column - 1][row + 1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - 1][row + 1];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if (listOfCells[column - 1][row - 1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - 1][row - 1];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            //
                            if (listOfCells[column][row - k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row - k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if (listOfCells[column - 1][row - k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - 1][row - k];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if (listOfCells[column - k][row - k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - k][row - k];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if (listOfCells[column - k][row - 1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - k][row - 1];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if (listOfCells[column - k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - k][row];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if (listOfCells[column - k][row + 1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - k][row + 1];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if (listOfCells[column - k][row + k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - k][row + k];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if (listOfCells[column - 1][row + k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column - 1][row + k];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if (listOfCells[column][row + k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row + k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+k);
                                return;
                            }


                        }
                    }

                    else if (this.row == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row);
                                this.virusGoal = listOfCells[column+1][row];
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row+1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row+1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            //
                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row+1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row+k];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row+k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row+k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-1][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row+k];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-k][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row+k];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row-1];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row);
                                return;
                            }

                        }

                        // case ff is in downside
                    }

                    else if (this.row == 32) {
                        for(k = 1 ; k < distance; k++) {

                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row-1];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            //
                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row-1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row-k];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row-k];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row-k];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row-1];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                        }

                    }

                    else {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row-1];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row);
                                return;
                            }

                            if(listOfCells[column-1][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row+1];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row+1);
                                return;
                            }

                            if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row+1];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row+1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-1];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-1);
                                return;
                            }

                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row-k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-k);
                                return;
                            }

                            if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row-k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row-k);
                                return;
                            }

                            if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row-1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row+1];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column-k][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-k][row+k];
                                this.virusGoal.setColumn(column-k);
                                this.virusGoal.setRow(row+k);
                                return;
                            }

                            if(listOfCells[column-1][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column-1][row+k];
                                this.virusGoal.setColumn(column-1);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column][row+k];
                                this.virusGoal.setColumn(column);
                                this.virusGoal.setRow(row+k);
                                return;
                            }

                            if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row+k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row+k];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row+1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row+1);
                                return;
                            }

                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row-1];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+k][row-k];
                                this.virusGoal.setColumn(column+k);
                                this.virusGoal.setRow(row-k);
                                break;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                this.virusGoal = listOfCells[column+1][row-k];
                                this.virusGoal.setColumn(column+1);
                                this.virusGoal.setRow(row-k);
                                return;
                            }
                        }

                    }
                }
                distance += 1;

            }
        } catch (Exception e) {
            //System.out.println("erreur i " + i + " et j : " + k);
        }
    }

    public boolean goalIsNull() {
        return this.virusGoal == null;
    }


    public void resetGoal() {
        this.virusGoal = null;
        this.distance = 3;
    }

    public String toString() {
        return "Doctor{" +
                "fireGoal=" + virusGoal +
                ", distance=" + distance +
                ", column=" + column +
                ", row=" + row +
                '}';
    }
}
