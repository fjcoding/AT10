package BankOCR;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitTest {
    @Test
    public void convertArrays_CorrectResult0() {
        String inputDigit = " _ "
                           + "| |"
                           + "|_|";
        int expected = 0;
        Digit digit = new Digit(inputDigit);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult1() {
        String inputDigit = "   "
                           + "  |"
                           + "  |";
        int expected = 1;
        Digit digit = new Digit(inputDigit);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void convertArrays_CorrectResult2() {
        String inputDigit = " _ "
                          + " _|"
                          + "|_ ";
        int expected = 2;
        Digit digit = new Digit(inputDigit);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
}
