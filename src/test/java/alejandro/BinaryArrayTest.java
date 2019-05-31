package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
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
}