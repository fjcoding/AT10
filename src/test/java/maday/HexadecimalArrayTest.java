package binaries.maday;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexadecimalArrayTest {
    HexadecimalArray hexadecimalArray;

    @Test
    public void ConvertToDecimalInt_EmptyArray_Result0() {
        hexadecimalArray = new HexadecimalArray(new String[]{});
        int expected = 0;
        int actual = hexadecimalArray.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalInt_NotEmptyArray_Result109519() {
        hexadecimalArray = new HexadecimalArray(new String[]{"1", "A", "B", "C", "F"});
        int expected = 109519;
        int actual = hexadecimalArray.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
}
