package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    @Test
    public void ConvertToDecimalInt_noDigits_result0() {
        BinaryArray binaryArray = new BinaryArray(new int[]{});
        assertEquals(0, binaryArray.ConvertToDecimalInt());
    }
}