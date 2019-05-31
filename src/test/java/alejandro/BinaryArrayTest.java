package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    /********************************/
    /* Test for binary digits input */
    /********************************/
    @Test (expected = Exception.class)
    public void ConvertToDecimalIntB_noDigits_resultIllegalArgumentException() {
        (new BinaryArray(new String[]{})).ConvertToDecimalInt('b');
    }

    @Test (expected = Exception.class)
    public void ConvertToDecimalIntB_outOfBandDigitsMinus9_resultNumberFormatException() {
        (new BinaryArray(new String[]{"-9"})).ConvertToDecimalInt('b');
    }

    @Test (expected = Exception.class)
    public void ConvertToDecimalIntB_outOfBoundsDigits4_resultNumberFormatException() {
        (new BinaryArray(new String[]{"4"})).ConvertToDecimalInt('b');
    }

    @Test
    public void ConvertToDecimalIntB_singleBit0_result0() {
        int expected = 0;
        int actual = (new BinaryArray(new String[]{"0"})).ConvertToDecimalInt('b');
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalIntB_singleBit1_result1() {
        int expected = 1;
        int actual = (new BinaryArray(new String[]{"1"})).ConvertToDecimalInt('b');
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalIntB_mostSignificativeBit0_result509() {
        int expected = 509;
        int actual = (new BinaryArray(new String[]{"0", "1", "1", "1", "1", "1", "1", "1", "0", "1"})).ConvertToDecimalInt('b');
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalIntB_mostSignificativeBit1_result509() {
        int expected = 509;
        int actual = (new BinaryArray(new String[]{"1", "1", "1", "1", "1", "1", "1", "0", "1"})).ConvertToDecimalInt('b');
        assertEquals(expected, actual);
    }

    /*****************************/
    /* Test for hex digits input */
    /*****************************/
    @Test (expected = Exception.class)
    public void ConvertToDecimalIntH_noDigits_resultIllegalArgumentException() {
        (new BinaryArray(new String[]{})).ConvertToDecimalInt('h');
    }

    @Test (expected = Exception.class)
    public void ConvertToDecimalIntH_outOfBoundsDigitsMinusB_resultNumberFormatException() {
        (new BinaryArray(new String[]{"-B"})).ConvertToDecimalInt('h');
    }

    @Test (expected = Exception.class)
    public void ConvertToDecimalIntH_outOfBoundsDigitsH_resultNumberFormatException() {
        (new BinaryArray(new String[]{"H"})).ConvertToDecimalInt('h');
    }

    @Test
    public void ConvertToDecimalIntH_singleBit0_result0() {
        int expected = 0;
        int actual = (new BinaryArray(new String[]{"0"})).ConvertToDecimalInt('h');
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalIntH_singleBit1_result1() {
        int expected = 1;
        int actual = (new BinaryArray(new String[]{"1"})).ConvertToDecimalInt('h');
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalIntH_mostSignificativeBit0_result69889() {
        int expected = 69889;
        int actual = (new BinaryArray(new String[]{"0", "1", "1", "1", "0", "1"})).ConvertToDecimalInt('h');
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalIntH_mostSignificativeBit1_result69889() {
        int expected = 69889;
        int actual = (new BinaryArray(new String[]{"1", "1", "1", "0", "1"})).ConvertToDecimalInt('h');
        assertEquals(expected, actual);
    }
}