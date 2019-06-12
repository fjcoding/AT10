package KataBankOCR;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitTest {

	@Test
	public void getDigit_result1() {
		String number = " _ "
		   		      + " _|"
		              + "|_ ";
				
		Digit digit = new Digit();
		Integer expected = 2;
		assertEquals(expected, digit.getDigit(number));
	}

}
