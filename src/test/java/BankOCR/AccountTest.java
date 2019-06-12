package BankOCR;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

    @Test
    public void convertNumber_29_correctResult() {
        Digit[] accountDigits = new Digit[2];
        String two = " _ " 
                   + " _|" 
                   + "|_ ";
        String nine = " _ " 
                    + "|_|" 
                    + " _|";
        accountDigits[0] = new Digit(two);
        accountDigits[1] = new Digit(nine);
        Account account = new Account();
        assertEquals("29", account.convertNumber(accountDigits));
    }

}
