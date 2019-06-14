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

    @Test
    public void convertArrays_CorrectResult3() {
        int expected = 3;
        Digit digit = new Digit(Digit.THREE);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult4() {
        int expected = 4;
        Digit digit = new Digit(Digit.FOUR);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult5() {
        int expected = 5;
        Digit digit = new Digit(Digit.FIVE);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult6() {
        int expected = 6;
        Digit digit = new Digit(Digit.SIX);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult7() {
        int expected = 7;
        Digit digit = new Digit(Digit.SEVEN);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult8() {
        int expected = 8;
        Digit digit = new Digit(Digit.EIGHT);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResult9() {
        int expected = 9;
        Digit digit = new Digit(Digit.NINE);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void convertArrays_CorrectResultA() {
        int expected = 10;
        Digit digit = new Digit(Digit.A);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void convertArrays_CorrectResultB() {
        int expected = 11;
        Digit digit = new Digit(Digit.B);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void convertArrays_CorrectResultC() {
        int expected = 12;
        Digit digit = new Digit(Digit.C);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void convertArrays_CorrectResultD() {
        int expected = 13;
        Digit digit = new Digit(Digit.D);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void convertArrays_CorrectResultE() {
        int expected = 14;
        Digit digit = new Digit(Digit.E);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }

    @Test
    public void convertArrays_CorrectResultF() {
        int expected = 15;
        Digit digit = new Digit(Digit.F);
        int actual = digit.convertArrays();
        assertEquals(expected, actual);
    }
}
