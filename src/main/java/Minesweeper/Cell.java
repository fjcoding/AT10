package Minesweeper;

public class Cell {
    Integer row;
    Integer column;

    public Cell(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public String creationTable() {
        String rowResult = "";
        for (Integer indexRow = 1; indexRow <= row; indexRow++) {
            for (Integer indexColumn = 1; indexColumn <= column; indexColumn++) {
                rowResult += ".";
            }
        }
        return rowResult;
    }
}
