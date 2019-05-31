package binaries.john;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    @Test
    public void Binary_unitTest_result2() {
        int expected = 2;
        BinaryArray binary = new BinaryArray(new int[]{1, 0});
        int actual = binary.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
	@Test
    public void Binary_unitTest_result503() {
        int expected = 503;
        BinaryArray binary = new BinaryArray(new int[]{1, 1, 1, 1, 1, 0, 1, 1, 1});
        int actual = binary.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }
	@Test (expected = Exception.class)
    public void Binary_unitTest_bigNumber() {
        (new BinaryArray(new int[]{10, 0})).ConvertToDecimalInt();
    }
	@Test (expected = Exception.class)
    public void Binary_unitTest_negative() {
        (new BinaryArray(new int[]{-1, 0})).ConvertToDecimalInt();
    }
	//Hexadecimal test
	@Test
    public void Binary_unitTest_result2() {
        int expected = 2748;
        int actual = new BinaryArray(new String[]{"A","B", "C" }).ConvertToDecimalInt();
        assertEquals(expected, actual);
	}
}

