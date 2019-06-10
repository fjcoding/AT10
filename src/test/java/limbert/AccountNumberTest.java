package binaries.limbert;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountNumberTest {
    @Test
    public void getDigit_six_sixMatrix() {
        AccountNumber accountNumber = new AccountNumber();
        int digit = 4;       
        assertEquals(digit,accountNumber.getDigit(3));
    }

}
