package minesweeper;

public class Field {
    
    Integer[][] cells;
    Integer rows;
    Integer columns;
     
    
    public Field(Integer[][] cells) {
        this.cells = cells;
        rows = cells.length;
        columns = cells[0].length;
    }
    
    
    public Integer getCellValue(Integer row, Integer column) {
        return this.cells[row][column];
    }
    
    public void addNeighbours(Integer row, Integer column) {
        addNorth(row, column);
        addSouth(row, column);
        addWest(row, column);
        addEast(row, column);
        addNorthWest(row, column);
        addNorthEast(row, column);
        addSouthWest(row, column);
        addSouthEast(row, column);
    }
    
    
    public void addNorth(Integer row, Integer column) {
        if ((row - 1) >= 0) {
            cells[row - 1][column]++;
        }
    }

    public void addSouth(Integer row, Integer column) {
        if ((row + 1) < rows) {
            cells[row + 1][column]++;
        }
    }
    
    public void addWest(Integer row, Integer column) {
        if ((column - 1) >= 0) {
            cells[row][column - 1]++;
        }
    }
    
    public void addEast(Integer row, Integer column) {
        if ((column + 1) < columns) {
            cells[row][column + 1]++;
        }
    }
    
    public void addNorthWest(Integer row, Integer column) {
        if (((row - 1) >= 0) && ((column - 1) >= 0)) {
            cells[row - 1][column - 1]++;
        }
    }

    public void addNorthEast(Integer row, Integer column) {
        if (((row - 1) >= 0) && ((column + 1) < columns)) {
            cells[row - 1][column + 1]++;
        }
    }

    public void addSouthWest(Integer row, Integer column) {
        if (((row + 1) < rows) && ((column - 1) >= 0)) {
            cells[row + 1][column - 1]++;
        }
    }

    public void addSouthEast(Integer row, Integer column) {
        if (((row + 1) < rows) && ((column + 1) < columns)) {
            cells[row + 1][column + 1]++;
        }
    }


}
