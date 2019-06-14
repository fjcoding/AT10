package KataBankOCR;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountNumberTest {	
	@Test
	public void test() { 
		String head_number = "    _  _     _  _  _  _  _ ";
		String body_number = "  | _| _||_||_ |_   ||_||_|";
		String foot_number = "  ||_  _|  | _||_|  ||_| _|";
		AccountNumber accountNumber = new AccountNumber(head_number,body_number,foot_number);
		Integer expected = 123456789;
		assertEquals(expected,accountNumber.getAccountNumber());
	}
	
	@Test
    public void accountNumberToString_correctResult() { 
        String head_number = " _  _  _     _  _  _  _  _ ";
        String body_number = "| | _| _||_||_ |_   ||_|| |";
        String foot_number = "|_||_  _|  | _||_|  ||_||_|";
        AccountNumber accountNumber = new AccountNumber(head_number,body_number,foot_number);
        String expected = "023456780";
        assertEquals(expected,accountNumber.getAccountNumberToString());
    }
	
	@Test
    public void validateAccountNumber_correctResult() { 
        String head_number = " _     _  _  _  _  _  _  _ ";
        String body_number = " _||_||_ |_||_| _||_||_ |_ ";
        String foot_number = " _|  | _||_||_||_ |_||_| _|";
        AccountNumber accountNumber = new AccountNumber(head_number,body_number,foot_number);
        assertTrue(accountNumber.validateAccountNumber());
    }
    
    @Test
    public void validateAccountNumber_incorrectResult() { 
        String head_number = " _  _     _  _        _  _ ";
        String body_number = "|_ |_ |_| _|  |  ||_||_||_ ";
        String foot_number = "|_||_|  | _|  |  |  | _| _|";
        AccountNumber accountNumber = new AccountNumber(head_number,body_number,foot_number);
        assertFalse(accountNumber.validateAccountNumber());
    }
}
