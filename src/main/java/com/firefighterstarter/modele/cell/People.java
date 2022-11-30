package com.firefighterstarter.modele.cell;

public class People {
    private int distance;
    private int column;
    private int row;
    private Cell emptyPlace;

    public People(int column, int row) {
        this.distance = 3; // because can juste mouve on 2 cells
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

    public void findEmptyPlace(Cell[][] listOfCells) {
        try {

            while(emptyPlace()) {
                int i;
                int k;
                if(distance == 4)
                    return;
                for(i = 0; i < distance; i++) {
                    if(this.row == 0 && this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column+1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row+1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row+k];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                        }

                    }
                    else if (this.row == 0 && this.column == 43) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column-1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column-1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row-1];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row-k];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row+1];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                        }

                    }

                    else if (this.row == 32 && this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column+1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row-k];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row-1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }


                        }

                    }

                    else if (this.row == 32 && this.column == 43) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column-1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row-1];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row);
                                return;
                            }

                            if(listOfCells[column-k][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row-k];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-1][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row-k];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row-1];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }



                        }

                        // case ff is on the left side
                    }

                    else if (this.column == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            //
                            if(listOfCells[column][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row+k];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row+1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row-1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row-k];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }

                        }

                        // case ff is on the right side
                    }

                    else if (this.column == 43) {
                        for (k = 1; k < distance; k++) {
                            if (listOfCells[column][row + 1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row + 1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if (listOfCells[column][row - 1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row - 1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if (listOfCells[column - 1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - 1][row];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if (listOfCells[column - 1][row + 1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - 1][row + 1];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if (listOfCells[column - 1][row - 1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - 1][row - 1];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            //
                            if (listOfCells[column][row - k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row - k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if (listOfCells[column - 1][row - k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - 1][row - k];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if (listOfCells[column - k][row - k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - k][row - k];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if (listOfCells[column - k][row - 1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - k][row - 1];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if (listOfCells[column - k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - k][row];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if (listOfCells[column - k][row + 1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - k][row + 1];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if (listOfCells[column - k][row + k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - k][row + k];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if (listOfCells[column - 1][row + k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column - 1][row + k];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if (listOfCells[column][row + k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row + k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }


                        }
                    }

                    else if (this.row == 0) {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column+1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row);
                                this.emptyPlace = listOfCells[column+1][row];
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            //
                            if(listOfCells[column+k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row+1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row+k];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+1][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-1][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row+k];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-k][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row+k];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column-k][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row-1];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row);
                                return;
                            }

                        }

                        // case ff is in downside
                    }

                    else if (this.row == 32) {
                        for(k = 1 ; k < distance; k++) {

                            if(listOfCells[column][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row-1];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            //
                            if(listOfCells[column+k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row-1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row-k];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-1][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row-k];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-k][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row-k];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }
                            if(listOfCells[column-k][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row-1];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                        }

                    }

                    else {
                        for(k = 1 ; k < distance; k++) {
                            if(listOfCells[column][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row-1];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row);
                                return;
                            }

                            if(listOfCells[column-1][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row+1];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }

                            if(listOfCells[column][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+1];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column+1][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+1][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-1];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }

                            if(listOfCells[column][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row-k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }

                            if(listOfCells[column-1][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row-k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row-k);
                                return;
                            }

                            if(listOfCells[column-k][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row-1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column-k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column-k][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row+1];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }
                            if(listOfCells[column-k][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-k][row+k];
                                this.emptyPlace.setColumn(column-k);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }

                            if(listOfCells[column-1][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column-1][row+k];
                                this.emptyPlace.setColumn(column-1);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column][row+k];
                                this.emptyPlace.setColumn(column);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }

                            if(listOfCells[column+1][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row+k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row+k];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row+k);
                                return;
                            }
                            if(listOfCells[column+k][row+1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row+1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row+1);
                                return;
                            }

                            if(listOfCells[column+k][row].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row);
                                return;
                            }
                            if(listOfCells[column+k][row-1].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row-1];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-1);
                                return;
                            }
                            if(listOfCells[column+k][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+k][row-k];
                                this.emptyPlace.setColumn(column+k);
                                this.emptyPlace.setRow(row-k);
                                break;
                            }
                            if(listOfCells[column+1][row-k].getColor() == ColorType.NOTHING) {
                                this.emptyPlace = listOfCells[column+1][row-k];
                                this.emptyPlace.setColumn(column+1);
                                this.emptyPlace.setRow(row-k);
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

    public boolean emptyPlace() {
        return this.emptyPlace == null;
    }

    public Cell getEmptyPlace() {
        return emptyPlace;
    }

    public void resetGoal() {
        this.emptyPlace = null;
        this.distance = 3;
    }

    @Override
    public String toString() {
        return "People{" +
                "distance=" + distance +
                ", column=" + column +
                ", row=" + row +
                ", emptyPlace=" + emptyPlace +
                '}';
    }
}
