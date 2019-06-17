package Minesweeper;

public class Minesweeper {

    Integer row, column;
    Field[][] fields;

    public Minesweeper(Integer row, Integer column, String[] fields) {
        this.row = row;
        this.column = column;
        this.fields = new Field[row][column];
        generateFields(fields);
    }

    public String[] fillFields() {
        String[] result = new String[row];
        return result;
    }

    private void generateFields(String[] fields) {
        for (int row = 0; row < this.fields.length; row++) {
            for (int column = 0; column < this.fields[row].length; column++) {
                Character[] neighborns = {' ',' '};
                this.fields[row][column]=new Field(neighborns);
            }
        }        
    }
}
