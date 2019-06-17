package Minesweeper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    Board board=new Board();
    @Test
    public void addValueCreateBoard_ResultTrue() throws Exception {
        Boolean expected = true;
        int n=4;
        int m=4;
        assertEquals(expected, board.asignar(n,m));
    }
    public void addValuefillWithAsterisco_True() throws Exception {
        Boolean expected = true;
        assertEquals(expected, board.llenar());
    }
}
