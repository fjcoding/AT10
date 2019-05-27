package binaries.andres;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryArrayTest {
    
    @Test
    public void ConvertToDecimalIntTest_1000_8() {
        int[] binary = {1,0,0,0};
        BinaryArray converter = new BinaryArray(binary);
        int expected = 8;
        int actual = converter.ConvertToDecimalInt();
        assertEquals(actual,expected);
    }
}