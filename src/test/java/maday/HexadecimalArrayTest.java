package binaries.maday;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexadecimalArrayTest {
    HexadecimalArray hexadecimalArray;

    @Test
    public void ConvertToDecimalInt_EmptyArray_Result0() {
        hexadecimalArray = new HexadecimalArray(new int[]{});
        int expected = 0;
        int actual = hexadecimalArray.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

}
