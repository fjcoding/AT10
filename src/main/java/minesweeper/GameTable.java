package src.main.java.minesweeper;

public class GameTable {

    String stringMines;
    Integer n;
    Integer m;

    public GameTable(String stringMines) {
        String naux = stringMines.substring(0, 1);
        String maux = stringMines.substring(2, 3);

        n = Integer.parseInt(naux);
        m = Integer.parseInt(maux);
        int lenghtString = stringMines.length();
        this.stringMines = stringMines.substring(3, lenghtString);
    }

    public String positionsToCheckMines(Integer position) {
        Integer qtty = 0;
        StringBuilder positions = new StringBuilder();
        if (position - 1 >= 0) {
            positions.append(position - 1);
            positions.append(" ");

        }

        if (position + 1 <= stringMines.length()) {
            positions.append(position + 1);
            positions.append(" ");
        }

        if (position - n >= 0) {
            positions.append(position - n);
            positions.append(" ");
        }

        if (position + n <= stringMines.length()) {
            positions.append(position + n);
            positions.append(" ");
        }

        if (position - n - 1 >= 0) {
            positions.append(position - n - 1);
            positions.append(" ");
        }

        if (position - n + 1 >= 0) {
            positions.append(position - n + 1);
            positions.append(" ");
        }

        if (position + n - 1 <= stringMines.length()) {
            positions.append(position + n - 1);
            positions.append(" ");
        }

        if (position + n + 1 <= stringMines.length()) {
            positions.append(position + n + 1);
            positions.append(" ");
        }
        
        String positionsToCheck = positions.toString();
        return positionsToCheck;
    }
    
    public String findAdjacentMines() {
        String minesTable = "";
       
        return minesTable;
    }
}
