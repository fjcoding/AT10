package binaries.josue;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
	@Test
	public void convertToDecimalInt_enterEmptyString_result0() {
		BinaryArray actual = new BinaryArray(new int[] {});
		assertEquals(0, actual.ConvertToDecimalInt());
	}
	@Test
	public void convertToDecimalInt_enterNotEmptyString_result43() {
		BinaryArray actual = new BinaryArray(new int[] {1,0,1,0,1,1});
		assertEquals(43, actual.ConvertToDecimalInt());
	}
	@Test(expected = Exception.class)
	public void convertToDecimalInt_enterNotEmptyStringWithNumbersNotBinarie_resultNotBinarie() {
		BinaryArray actual = new BinaryArray(new int [] {1,-1});
		assertEquals("Not binario", actual.ConvertToDecimalInt());
	}
}
