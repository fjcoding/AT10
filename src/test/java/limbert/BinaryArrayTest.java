package limbert;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import binaries.limbert.BinaryArray;
public class BinaryArrayTest {
    @Test
    public void ConvertToDecimalInt_resultEmpty(){
        int expected = 0;
        BinaryArray binary = new BinaryArray(new int[] { });
        int actual = binary.ConvertToDecimalInt();
        assertEquals(expected,actual);
    }
    @Test
    public void ConvertToDecimalInt_result43(){
        int expected = 43;
        BinaryArray binary = new BinaryArray(new int[] {1, 0, 1, 0, 1, 1});
        int actual = binary.ConvertToDecimalInt();
        assertEquals(expected,actual);
    }

    @Test
    public void HexadecimaltoDecimal_return15(){
        int expected = 15;
        BinaryArray binary = new BinaryArray("f");
        int actual = binary.HexadecimalToDecimal();
        assertEquals(expected,actual);
    }

    @Test
    public void HexadecimaltoDecimal_return1279(){
        int expected = 1279;
        BinaryArray binary = new BinaryArray("4ff");
        int actual = binary.HexadecimalToDecimal();
        assertEquals(expected,actual);
    }

    @Test
    public void HexadecimaltoDecimal_returnEmpty(){
        int expected = 0;
        BinaryArray binary = new BinaryArray("");
        int actual = binary.HexadecimalToDecimal();
        assertEquals(expected,actual);
    }
}