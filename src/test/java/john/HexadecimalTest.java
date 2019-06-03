package binaries.john;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexadecimalTest {
    @Test
    public void Hexadecimal_verigy_Value2748() throws Exception {
        long expected = 2748;
        long actual = (new HexadecimalConvert("abc")).ConvertHexadecimal();
        assertEquals(expected, actual);
    }
    @Test
    public void Hexadecimal_verigy_NullValues_Value0() throws Exception {
        long expected = 0;
        long actual = (new HexadecimalConvert("0")).ConvertHexadecimal();
        assertEquals(expected, actual);
    }
    @Test
    public void Hexadecimal_verigy_Value9999() throws Exception {
        long expected = 9999;
        long actual = (new HexadecimalConvert("270f")).ConvertHexadecimal();
        assertEquals(expected, actual);
    }
}