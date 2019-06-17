package Minesweeper;

public class Field {
    Character[][] fieldNeighbors;

    public Field(Character[][] fieldNeighbors) {
        this.fieldNeighbors = fieldNeighbors;
    }

    public Integer getMineNeighbors() {
        Integer result = 0;
        for (int row = 0; row < fieldNeighbors.length; row++) {
            for (int column = 0; column < fieldNeighbors[row].length; column++) {
                if (fieldNeighbors[row][column] == '*') {
                    result++;
                }
            }
        }
        return result;
    }

}
