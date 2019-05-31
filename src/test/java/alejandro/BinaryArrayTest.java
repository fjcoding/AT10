package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    @Test
    public void ConvertToDecimalIntB_singleBit1_result1() {
        int expected = 1;
        int actual = (new BinaryArray(new String[]{"1"})).ConvertToDecimalInt('b');
        assertEquals(expected, actual);
    }
}