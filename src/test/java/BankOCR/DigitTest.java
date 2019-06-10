package BankOCR;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitTest {
    @Test
    public void convertArrays_CorrectResult0() {
        String inputDigit0 = " _ | ||_|";
        int expected = 0;
        Digit digit = new Digit();
        int actual = digit.convertArrays(inputDigit0);
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult1() {
        String inputDigit1 = "     |  |";
        int expected = 1;
        Digit digit1 = new Digit();
        int actual = digit1.convertArrays(inputDigit1);
        assertEquals(expected, actual);
    }
}
