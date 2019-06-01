package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitsArrayTest {
    final char FROM_BINARY = 'b';
    final char FROM_HEXADECIMAL = 'h';
    
    /**************************************/
    /* Test Cases for binary digits input */
    /**************************************/
    @Test
    public void convertToDecimalIntegerB_singleBit0_result0() {
        String[] stringArray = new String[]{"0"};
        DigitsArray digits = new DigitsArray(stringArray);
        int actual = digits.convertToDecimalInteger(FROM_BINARY);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void convertToDecimalIntegerB_singleBit1_result1() {
        String[] stringArray = new String[]{"1"};
        DigitsArray digits = new DigitsArray(stringArray);
        int actual = digits.convertToDecimalInteger(FROM_BINARY);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void convertToDecimalIntegerB_mostSignificativeBit0_result509() {
        String[] stringArray = new String[]{"0", "1", "1", "1", "1", "1", "1", "1", "0", "1"};
        DigitsArray digits = new DigitsArray(stringArray);
        int actual = digits.convertToDecimalInteger(FROM_BINARY);
        int expected = 509;
        assertEquals(expected, actual);
    }

    @Test
    public void convertToDecimalIntegerB_mostSignificativeBit1_result509() {
        String[] stringArray = new String[]{"1", "1", "1", "1", "1", "1", "1", "0", "1"};
        DigitsArray digits = new DigitsArray(stringArray);
        int actual = digits.convertToDecimalInteger(FROM_BINARY);
        int expected = 509;
        assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void convertToDecimalIntegerB_noDigits_resultIllegalArgumentException() {
        String[] stringArray = new String[]{};
        DigitsArray digits = new DigitsArray(stringArray);
        digits.convertToDecimalInteger(FROM_BINARY);
    }

    @Test (expected = Exception.class)
    public void convertToDecimalIntegerB_outOfBandDigitsMinus9_resultNumberFormatException() {
        String[] stringArray = new String[]{"-9"};
        DigitsArray digits = new DigitsArray(stringArray);
        digits.convertToDecimalInteger(FROM_BINARY);
    }

    @Test (expected = Exception.class)
    public void convertToDecimalIntegerB_outOfBoundsDigits4_resultNumberFormatException() {
        String[] stringArray = new String[]{"4"};
        DigitsArray digits = new DigitsArray(stringArray);
        digits.convertToDecimalInteger(FROM_BINARY);
    }

    /***********************************/
    /* Test Cases for hex digits input */
    /***********************************/
    @Test
    public void convertToDecimalIntegerH_singleBit0_result0() {
        String[] stringArray = new String[]{"0"};
        DigitsArray digits = new DigitsArray(stringArray);
        int actual = digits.convertToDecimalInteger(FROM_HEXADECIMAL);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void convertToDecimalIntegerH_singleBit1_result1() {
        String[] stringArray = new String[]{"1"};
        DigitsArray digits = new DigitsArray(stringArray);
        int actual = digits.convertToDecimalInteger(FROM_HEXADECIMAL);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void convertToDecimalIntegerH_mostSignificativeBit0_result69889() {
        String[] stringArray = new String[]{"0", "1", "1", "1", "0", "1"};
        DigitsArray digits = new DigitsArray(stringArray);
        int actual = digits.convertToDecimalInteger(FROM_HEXADECIMAL);
        int expected = 69889;
        assertEquals(expected, actual);
    }

    @Test
    public void convertToDecimalIntegerH_mostSignificativeBit1_result69889() {
        String[] stringArray = new String[]{"1", "1", "1", "0", "1"};
        DigitsArray digits = new DigitsArray(stringArray);
        int actual = digits.convertToDecimalInteger(FROM_HEXADECIMAL);
        int expected = 69889;
        assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void convertToDecimalIntegerH_noDigits_resultIllegalArgumentException() {
        String[] stringArray = new String[]{};
        DigitsArray digits = new DigitsArray(stringArray);
        digits.convertToDecimalInteger(FROM_HEXADECIMAL);
    }

    @Test (expected = Exception.class)
    public void convertToDecimalIntegerH_outOfBoundsDigitsMinusB_resultNumberFormatException() {
        String[] stringArray = new String[]{"-B"};
        DigitsArray digits = new DigitsArray(stringArray);
        digits.convertToDecimalInteger(FROM_HEXADECIMAL);
    }

    @Test (expected = Exception.class)
    public void convertToDecimalIntegerH_outOfBoundsDigitsH_resultNumberFormatException() {
        String[] stringArray = new String[]{"H"};
        DigitsArray digits = new DigitsArray(stringArray);
        digits.convertToDecimalInteger(FROM_HEXADECIMAL);
    }
}
