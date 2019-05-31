package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    @Test (expected = IllegalArgumentException.class)
    public void ConvertToDecimalIntB_noDigits_resultIllegalArgumentException() {
        (new BinaryArray(new String[]{})).ConvertToDecimalInt('b');
    }

    @Test (expected = IllegalArgumentException.class)
    public void ConvertToDecimalIntB_outOfBandDigitsMinus9_resultIllegalArgumentException() {
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
}