package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    @Test (expected = IllegalArgumentException.class)
    public void ConvertToDecimalInt_noDigits_resultIllegalArgumentException() {
        (new BinaryArray(new int[]{})).ConvertToDecimalInt();
    }

    @Test (expected = IllegalArgumentException.class)
    public void ConvertToDecimalInt_invalidDigits_resultIllegalArgumentException() {
        (new BinaryArray(new int[]{-1, 6, -9})).ConvertToDecimalInt();
    }

    @Test
    public void ConvertToDecimalInt_singleBit0_result0() {
        int expected = 0;
        int actual = (new BinaryArray(new int[]{0})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalInt_singleBit1_result1() {
        int expected = 1;
        int actual = (new BinaryArray(new int[]{1})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalInt_mostSignificativeBit0_result509() {
        int expected = 509;
        int actual = (new BinaryArray(new int[]{0, 1, 1, 1, 1, 1, 1, 1, 0, 1})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalInt_mostSignificativeBit1_result509() {
        int expected = 509;
        int actual = (new BinaryArray(new int[]{1, 1, 1, 1, 1, 1, 1, 0, 1})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
}
