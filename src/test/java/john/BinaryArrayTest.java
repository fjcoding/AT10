package binaries.john;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    @Test
    public void Binary_unitTest2() {
        int expected = 2;
        BinaryArray binary = new BinaryArray(new int[]{1, 0});
        int actual = binary.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
}
