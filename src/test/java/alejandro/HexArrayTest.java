package binaries.alejandro;

import static org.junit.Assert.*;

import org.junit.Test;

public class HexArrayTest {
    @Test
    public void ConvertToDecimalInt_singleBit1_result15() {
        int expected = 15;
        int actual = (new HexArray(new int[]{15})).ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
}
