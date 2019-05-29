package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    @Test
    public void ConvertToDecimalInt_singleBit1_result1() {
        int expected = 1;
        int actual = (new BinaryArray(new int[]{1})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
}
