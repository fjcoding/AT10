package binaries.andres;

import static org.junit.Assert.*;

import org.junit.Test;

public class HexadecimalArrayTest {

    @Test
    public void hexadecimalArray_AAA_result2730() {
        HexadecimalArray actual = new HexadecimalArray(new String("AAA"));
        int expected = 2730;
        assertEquals(expected,actual.ConvertToDecimalInt());
    }
    
    @Test
    public void hexadecimalArray_emptyArraz_resultZero() {
        HexadecimalArray actual = new HexadecimalArray(new String(""));
        int expected = 0;
        assertEquals(expected,actual.ConvertToDecimalInt());
    }

}
