package BankOCR;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitTest {
    @Test
    public void convertArrays_CorrectResult0() {
        int expected = 0;
        Digit digit = new Digit(Digit.ZERO);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult1() {
        int expected = 1;
        Digit digit = new Digit(Digit.ONE);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void convertArrays_CorrectResult2() {
        int expected = 2;
        Digit digit = new Digit(Digit.TWO);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
}
