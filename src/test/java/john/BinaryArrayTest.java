package binaries.john;

import static org.junit.Assert.*;

import org.junit.Test;

import binaries.josue.BinaryArray;

public class BinaryArrayTest {
	@Test
	public void convertToDecimalInt_enterEmptyString_result0() {
		BinaryArray actual = new BinaryArray(new int[] {});
		assertEquals(0, actual.ConvertToDecimalInt());
	}
}