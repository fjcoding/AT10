package binaries.andres;

import static org.junit.Assert.*;

import org.junit.Test;

public class HexadecimalArrayTest {

    @Test
    public void ConvertToDecimalIntTest_ABCE12_11259410() {
        String hexadecimal = "ABCE12";
        HexadecimalArray converter = new HexadecimalArray(hexadecimal);
        int expected = 11259410;
        int actual = converter.ConvertToDecimalInt();
        assertEquals(actual, expected);
    }

}
