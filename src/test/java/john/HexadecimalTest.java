package binaries.john;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexadecimalTest {
    @Test
    public void Hexadecimal_verigy_NullValues() throws Exception {
        long expected = 2748;
        long actual = (new HexadecimalConvert("abc")).ConvertHexadecimal();
        assertEquals(expected, actual);
    }
}