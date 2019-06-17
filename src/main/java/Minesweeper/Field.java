package Minesweeper;

public class Field {
    Character[] fieldNeighbors;

    public Field(Character[] fieldNeighbors) {
        this.fieldNeighbors = fieldNeighbors;
    }

    public Integer getMineNeighbors() {
        Integer result = 0;
        for (int index = 0; index < fieldNeighbors.length; index++) {
            try {
                if (fieldNeighbors[index]== '*') {
                    result++;
                }
            } catch (Exception e) {
                // nothing
            }
        }
        return result;
    }
}
