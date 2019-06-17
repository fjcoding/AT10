package Minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinesweeperTest {
   
    @Test
    public void fillFields_4x4correctResult() {
        String[] fields = {"*...","....",".*..","...."};
        Minesweeper minesweeper = new Minesweeper(4, 4, fields);
        String[] actual = minesweeper.fillFields();
        String[] expected = {"*100","2210","1*10","1110"};
        //assertEquals(expected, actual);        
    }
    
}
