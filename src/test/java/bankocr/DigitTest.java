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
}