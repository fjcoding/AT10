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

    @Test
    public void getIntValue2_shouldReturn2() {
        String head = " _ ";
        String body = " _|";
        String foot = "|_ ";
        Digit digit2 = new Digit(head, body, foot);
        assertEquals(2, digit2.getIntValue());
    }

    @Test
    public void getIntValue3_shouldReturn3() {
        String head = " _ ";
        String body = " _|";
        String foot = " _|";
        Digit digit3 = new Digit(head, body, foot);
        assertEquals(3, digit3.getIntValue());
    }

    @Test
    public void getIntValue4_shouldReturn4() {
        String head = "   ";
        String body = "|_|";
        String foot = "  |";
        Digit digit4 = new Digit(head, body, foot);
        assertEquals(4, digit4.getIntValue());
    }

    @Test
    public void getIntValue5_shouldReturn5() {
        String head = " _ ";
        String body = "|_ ";
        String foot = " _|";
        Digit digit5 = new Digit(head, body, foot);
        assertEquals(5, digit5.getIntValue());
    }

    @Test
    public void getIntValue6_shouldReturn6() {
        String head = " _ ";
        String body = "|_ ";
        String foot = "|_|";
        Digit digit6 = new Digit(head, body, foot);
        assertEquals(6, digit6.getIntValue());
    }

    @Test
    public void getIntValue7_shouldReturn7() {
        String head = " _ ";
        String body = "  |";
        String foot = "  |";
        Digit digit7 = new Digit(head, body, foot);
        assertEquals(7, digit7.getIntValue());
    }

    @Test
    public void getIntValue8_shouldReturn8() {
        String head = " _ ";
        String body = "|_|";
        String foot = "|_|";
        Digit digit8 = new Digit(head, body, foot);
        assertEquals(8, digit8.getIntValue());
    }
}