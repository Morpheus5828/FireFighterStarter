package com.firefighterstarter.modele.cell.FireFighter;

import com.firefighterstarter.modele.cell.Cell;
import com.firefighterstarter.modele.cell.ColorType;


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
                int i;
                int k;
                if(distance == 4)
                    return;
                for(i = 0; i < distance; i++) {
                    if(this.row == 0 && this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row+1];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row+1];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row+1];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row+k];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row+k];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row+k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row+k);
                                return;
                            }


                        }

                    }
                    else if (this.row == 0 && this.column == 43) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row+1];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row-1];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row-k];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row+k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row+k];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row+1];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                        }

                    }

                    else if (this.row == 32 && this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                           if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                               this.fireGoal = listOfCells[column+1][row];
                               this.fireGoal.setColumn(column+1);
                               this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row-1];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row-1];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row-k];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row-1];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row-k];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row-k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-k);
                                return;
                            }


                        }

                    }

                    else if (this.row == 32 && this.column == 43) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row-1];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row-1];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row);
                                return;
                            }

                            if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row-k];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row-k];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row-k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row-1];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row-1);
                                return;
                            }



                        }

                        // case ff is on the left side
                    }

                    else if (this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                           if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row+1];
                               this.fireGoal.setColumn(column);
                               this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row-1];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row+1];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row-1];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            //
                            if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row+k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row+k];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row+k];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row+1];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row-1];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row-k];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row-k];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row-k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-k);
                                return;
                            }

                        }

                        // case ff is on the right side
                    }

                    else if (this.column == 43) {
                        for (k = 1; k < distance; k++) {
                                if (listOfCells[column][row + 1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row + 1];
                                    this.fireGoal.setColumn(column);
                                    this.fireGoal.setRow(row+1);
                                    return;
                                }
                                if (listOfCells[column][row - 1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row - 1];
                                    this.fireGoal.setColumn(column);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                if (listOfCells[column - 1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - 1][row];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row);
                                    return;
                                }
                                if (listOfCells[column - 1][row + 1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - 1][row + 1];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row+1);
                                    return;
                                }
                                if (listOfCells[column - 1][row - 1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - 1][row - 1];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                //
                                if (listOfCells[column][row - k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row - k];
                                    this.fireGoal.setColumn(column);
                                    this.fireGoal.setRow(row-k);
                                    return;
                                }
                                if (listOfCells[column - 1][row - k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - 1][row - k];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row-k);
                                    return;
                                }
                                if (listOfCells[column - k][row - k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - k][row - k];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row-k);
                                    return;
                                }
                                if (listOfCells[column - k][row - 1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - k][row - 1];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                if (listOfCells[column - k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - k][row];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row);
                                    return;
                                }
                                if (listOfCells[column - k][row + 1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - k][row + 1];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row+1);
                                    return;
                                }
                                if (listOfCells[column - k][row + k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - k][row + k];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row+k);
                                    return;
                                }
                                if (listOfCells[column - 1][row + k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column - 1][row + k];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row+k);
                                    return;
                                }
                                if (listOfCells[column][row + k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row + k];
                                    this.fireGoal.setColumn(column);
                                    this.fireGoal.setRow(row+k);
                                    return;
                                }


                        }
                    }

                    else if (this.row == 0) {
                        for(k = 1 ; k < distance; k++) {
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal.setColumn(column+1);
                                    this.fireGoal.setRow(row);
                                    this.fireGoal = listOfCells[column+1][row];
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row);
                                    return;
                                }
                                if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+1];
                                    this.fireGoal.setColumn(column);
                                    this.fireGoal.setRow(row+1);
                                    return;
                                }
                                if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+1];
                                    this.fireGoal.setColumn(column+1);
                                    this.fireGoal.setRow(row+1);
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    this.fireGoal.setColumn(column+1);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                //
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    this.fireGoal.setColumn(column+k);
                                    this.fireGoal.setRow(row);
                                    return;
                                }
                                if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+1];
                                    this.fireGoal.setColumn(column+k);
                                    this.fireGoal.setRow(row+1);
                                    return;
                                }
                                if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row+k];
                                    this.fireGoal.setColumn(column+k);
                                    this.fireGoal.setRow(row+k);
                                    return;
                                }
                                if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row+k];
                                    this.fireGoal.setColumn(column+1);
                                    this.fireGoal.setRow(row+k);
                                    return;
                                }
                                if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row+k];
                                    this.fireGoal.setColumn(column);
                                    this.fireGoal.setRow(row+k);
                                    return;
                                }
                                if(listOfCells[column-1][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row+k];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row+k);
                                    return;
                                }
                                if(listOfCells[column-k][row+k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row+k];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row+k);
                                    return;
                                }
                                if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-1];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row);
                                    return;
                                }

                        }

                        // case ff is in downside
                    }

                    else if (this.row == 32) {
                        for(k = 1 ; k < distance; k++) {

                                if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-1];
                                    this.fireGoal.setColumn(column);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-1];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-1];
                                    this.fireGoal.setColumn(column+1);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row];
                                    this.fireGoal.setColumn(column+1);
                                    this.fireGoal.setRow(row);
                                    return;
                                }
                                if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row);
                                    return;
                                }
                                //
                                if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row];
                                    this.fireGoal.setColumn(column+k);
                                    this.fireGoal.setRow(row);
                                    return;
                                }
                                if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-1];
                                    this.fireGoal.setColumn(column+k);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+k][row-k];
                                    this.fireGoal.setColumn(column+k);
                                    this.fireGoal.setRow(row-k);
                                    return;
                                }
                                if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column+1][row-k];
                                    this.fireGoal.setColumn(column+1);
                                    this.fireGoal.setRow(row-k);
                                    return;
                                }
                                if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column][row-k];
                                    this.fireGoal.setColumn(column);
                                    this.fireGoal.setRow(row-k);
                                    return;
                                }
                                if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-1][row-k];
                                    this.fireGoal.setColumn(column-1);
                                    this.fireGoal.setRow(row-k);
                                    return;
                                }
                                if(listOfCells[column-k][row-k].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-k];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row-k);
                                    return;
                                }
                                if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row-1];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row-1);
                                    return;
                                }
                                if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                    this.fireGoal = listOfCells[column-k][row];
                                    this.fireGoal.setColumn(column-k);
                                    this.fireGoal.setRow(row);
                                    return;
                                }
                            }

                    }

                    else {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row-1];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row-1];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row);
                                return;
                            }

                            if(listOfCells[column-1][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row+1];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row+1);
                                return;
                            }

                            if(listOfCells[column][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row+1];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row+1];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row-1];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row-1);
                                return;
                            }

                            if(listOfCells[column][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row-k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-k);
                                return;
                            }

                            if(listOfCells[column-1][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row-k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row-k);
                                return;
                            }

                            if(listOfCells[column-k][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row-1];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row+1];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column-k][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-k][row+k];
                                this.fireGoal.setColumn(column-k);
                                this.fireGoal.setRow(row+k);
                                return;
                            }

                            if(listOfCells[column-1][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column-1][row+k];
                                this.fireGoal.setColumn(column-1);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column][row+k];
                                this.fireGoal.setColumn(column);
                                this.fireGoal.setRow(row+k);
                                return;
                            }

                            if(listOfCells[column+1][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row+k];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row+k];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row+1];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row+1);
                                return;
                            }

                            if(listOfCells[column+k][row].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row-1];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+k][row-k];
                                this.fireGoal.setColumn(column+k);
                                this.fireGoal.setRow(row-k);
                                break;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.FIRE) {
                                this.fireGoal = listOfCells[column+1][row-k];
                                this.fireGoal.setColumn(column+1);
                                this.fireGoal.setRow(row-k);
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
        return this.fireGoal == null;
    }


    public void resetGoal() {
        this.fireGoal = null;
        this.distance = 3;
    }

    public String display() {
        return "FireFighter{" +
                "fireGoal=" + fireGoal +
                ", distance=" + distance +
                ", column=" + column +
                ", row=" + row +
                '}';
    }
}
