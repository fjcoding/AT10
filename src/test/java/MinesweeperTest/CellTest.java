package MinesweeperTest;
import static org.junit.Assert.*;

import Minesweeper.Cell;
import org.junit.Test;

public class CellTest{

    @Test
    public void creationTable_correctResult4x4(){
        Cell table = new Cell(4, 4);
        assertEquals("...." +
                              "...." +
                              "...." +
                              "....", table.creationTable());
    }
}