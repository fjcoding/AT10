package binaries.maday;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    BinaryArray binaryArray;

    @Test
    public void ConvertToDecimalInt_EmptyArray_Result() {
        binaryArray = new BinaryArray(new int[]{});
        int expected = 0;
        int actual = binaryArray.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
}