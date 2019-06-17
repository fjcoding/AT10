package Minesweeper;

import java.util.ArrayList;

public class Cell {
    Integer row;
    Integer column;

    public Cell(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public String creationTable() {
        byte[][] table = new byte[row][column];
        String rowResult = "";
        for (Integer indexRow = 1; indexRow <= table.length; indexRow++) {
            for (Integer indexColumn = 1; indexColumn <= table[0].length; indexColumn++) {
                rowResult += ".";
            }
        }
        return rowResult;
    }

}
