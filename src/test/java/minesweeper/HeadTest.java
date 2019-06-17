package minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeadTest {

    @Test
    public void lines_2and3_result2() {
        Head head = new Head("2 3");
        String excepted = "2";
        head.linesColumns();
        assertEquals(excepted, head.lines());
    }
    @Test
    public void columns_2and3_result3() {
        Head head = new Head("2 3");
        String excepted = "3";
        head.linesColumns();
        assertEquals(excepted, head.columns());
    }
    @Test
    public void correctValues_negative1and5_resultTrue() {
        Head head = new Head("-1 3");
        head.linesColumns();
        assertTrue(head.correctValues());
    }
}
