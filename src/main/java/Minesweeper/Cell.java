package Minesweeper;

import java.util.ArrayList;

public class Cell {
    Integer row;
    Integer column;
    String safe;

    public Cell(Integer row, Integer column, String safe) {
        this.row = row;
        this.column = column;
        this.safe = safe;
    }

    public String creationTable() {
        byte[][] table = new byte[row][column];
        String rowResult = "";
        for (Integer indexRow = 1; indexRow <= table.length; indexRow++) {
            for (Integer indexColumn = 1; indexColumn <= table[0].length; indexColumn++) {
                rowResult += "0";
            }
        }
        return rowResult;
    }
}
