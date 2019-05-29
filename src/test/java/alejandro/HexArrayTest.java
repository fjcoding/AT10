package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class HexArrayTest {
    @Test (expected = IllegalArgumentException.class)
    public void ConvertToDecimalInt_noDigits_resultIllegalArgumentException() {
        (new HexArray(new int[]{})).ConvertToDecimalInt();
    }

    @Test (expected = IllegalArgumentException.class)
    public void ConvertToDecimalInt_invalidDigits_resultIllegalArgumentException() {
        (new HexArray(new int[]{-1, 36, -9})).ConvertToDecimalInt();
    }
    

    @Test
    public void ConvertToDecimalInt_singleBit0_result0() {
        int expected = 0;
        int actual = (new HexArray(new int[]{0})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalInt_singleBit1_result15() {
        int expected = 15;
        int actual = (new HexArray(new int[]{15})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
    
    @Test
    public void ConvertToDecimalInt_mostSignificativeBit0_result509() {
        int expected = 4353;
        int actual = (new HexArray(new int[]{0, 1, 1, 0, 1})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalInt_mostSignificativeBit1_result509() {
        int expected = 4353;
        int actual = (new HexArray(new int[]{1, 1, 0, 1})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
    
}
