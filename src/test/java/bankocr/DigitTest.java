package bankocr;

import static org.junit.Assert.*;
import org.junit.Test;

public class DigitTest {

    @Test
    public void getIntValue0_shouldReturn0() {
        String head = " _ ";
        String body = "| |";
        String foot = "|_|";
        Digit digit0 = new Digit(head, body, foot);
        assertEquals(0, digit0.getIntValue());
    }

    @Test
    public void getIntValue1_shouldReturn1() {
        String head = "   ";
        String body = "  |";
        String foot = "  |";
        Digit digit1 = new Digit(head, body, foot);
        assertEquals(1, digit1.getIntValue());
    }
}