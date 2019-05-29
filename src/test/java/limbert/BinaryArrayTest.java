package binaries.limbert;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    @Test
    public void ConvertToDecimalInt_result43() {
        int expected = 0;
        BinaryArray binary = new BinaryArray(new int[] { });
        int actual = binary.ConvertToDecimalInt();
        assertEquals(expected,actual);
    }
}