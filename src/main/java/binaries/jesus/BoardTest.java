package Minesweeper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    Board board=new Board();
    @Test
    public void addValuer_Board_Result() throws Exception {
        Boolean expected = true;
        int n=4;
        int m=4;
        assertEquals(expected, board.asignar(n,m));
    }
}
