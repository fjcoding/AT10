package src.test.java.minesweeper;

import src.main.java.minesweeper.*;
import org.junit.Test;

import src.main.java.minesweeper.GameTable;

import static org.junit.Assert.*;

public class GameTableTest {

    @Test
    public void positionsToCheckMines_correctResult_position1() {
        String stringMinesInput = "4 4"
                                + "*..."
                                + "...."
                                + ".*.."
                                + "....";
        GameTable table = new GameTable(stringMinesInput);        
        Integer position = 1;
        String expected = "0 2 5 4 6 ";
        assertEquals(expected, table.positionsToCheckMines(position));
    }
    
    @Test
    public void positionsToCheckMines_correctResult_position5() {
        String stringMinesInput = "4 4"
                                + "*..."
                                + "...."
                                + ".*.."
                                + "....";
        GameTable table = new GameTable(stringMinesInput);        
        Integer position = 5;
        String expected = "4 6 1 9 0 2 8 10 ";
        assertEquals(expected, table.positionsToCheckMines(position));
    }
}
