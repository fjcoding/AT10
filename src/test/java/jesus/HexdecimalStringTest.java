package binaries.jesus;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HexdecimalStringTest {

    HexadecimalString hexadecimalArray;

    @Test(expected = IllegalArgumentException.class)
    public void binary_comvertToDeciamValueNll_resultMistake() throws Exception {
        (new HexadecimalString(new String(""))).ConvertToHexadecimalInt();

    }

    @Test (expected = IllegalArgumentException.class)
    public void binary_mistakevalueCharacteres_resultMistake() throws Exception {
        (new HexadecimalString(new String("$#@#"))).ConvertToHexadecimalInt();
    }

    @Test
    public void hexadecimal_comvertToDeciam_result0() throws Exception {
        int expected = 0;
        long actual=(new HexadecimalString(new String("0"))).ConvertToHexadecimalInt();;
        assertEquals(expected, actual);
    }
    @Test
    public void hexadecimal_comvertToDeciam_result893247333() throws Exception {
        long expected = 893247333;
        long actual=(new HexadecimalString(new String("353ddf65"))).ConvertToHexadecimalInt();;
        assertEquals(expected, actual);
    }
    @Test
    public void hexadecimal_comvertToDeciam_result999999999() throws Exception {
        long expected = 999999999;
        long actual=(new HexadecimalString(new String("3b9ac9ff"))).ConvertToHexadecimalInt();;
        assertEquals(expected, actual);
    }
    @Test
    public void hexadecimal_comvertToDeciam_resultNegative999999999() throws Exception {
        long expected = -999999999;
        long actual=(new HexadecimalString(new String("-3b9ac9ff"))).ConvertToHexadecimalInt();;
        assertEquals(expected, actual);
    }
}
