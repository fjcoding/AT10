package binaries.josue;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
	@Test
	public void binariesToDecimal_withArrayEmpty_resultTrue() {
		BinaryArray actual = new BinaryArray(new String[] {},'b');
		int expected = 0;
		assertEquals(expected,actual.binariesToDecimal());
	}
	@Test
	public void binariesToDecimal_withArrayEmpty_resultFalse() {
		BinaryArray actual = new BinaryArray(new String[] {"1","0"},'b');
		int expected = 0;
		assertNotEquals(expected,actual.binariesToDecimal());
	}
	@Test
	public void binariesToDecimal_withArrayNotEmpty_resultTrue() {
		BinaryArray actual = new BinaryArray(new String[] {"1","0","1","0","1","1"},'b');
		int expected = 43;
		assertEquals(expected,actual.binariesToDecimal());
	}
	@Test
	public void binariesToDecimal_withArrayNotEmpty_resultFalse() {
		BinaryArray actual = new BinaryArray(new String[] {"1","0"},'b');
		int expected = 43;
		assertNotEquals(expected,actual.binariesToDecimal());
	}
	@Test
	public void hexaToDecimal_withArrayEmpty_resultTrue() {
		BinaryArray actual = new BinaryArray(new String[] {},'h');
		int expected = 0;
		assertEquals(expected,actual.hexadecimalToDecimal());
	}
	@Test
	public void hexaToDecimal_withArrayEmpty_resultFalse() {
		BinaryArray actual = new BinaryArray(new String[] {"1"},'h');
		int expected = 0;
		assertNotEquals(expected,actual.hexadecimalToDecimal());
	}
	@Test
	public void hexaToDecimal_withArrayNotEmpty_resultTrue() {
		BinaryArray actual = new BinaryArray(new String[] {"a"},'h');
		int expected = 10;
		assertEquals(expected,actual.hexadecimalToDecimal());
	}
	@Test
	public void hexaToDecimal_withArrayNotEmpty_resultFalse() {
		BinaryArray actual = new BinaryArray(new String[] {"a"},'h');
		int expected = 11;
		assertNotEquals(expected,actual.hexadecimalToDecimal());
	}
}