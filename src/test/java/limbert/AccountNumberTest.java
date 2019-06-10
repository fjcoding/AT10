package binaries.limbert;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountNumberTest {
    @Test
    public void getDigit_six_sixMatrix() {
        AccountNumber accountNumber = new AccountNumber();
        int digit = 6;
        assertEquals(digit, accountNumber.getDigit(5));
    }

    @Test
    public void setDigit_digitThree_return() {
        AccountNumber accountNumber = new AccountNumber();
        char matrixThree[][]=new char[][] {' ','_',' ' },{' ','_','|'},{' ','_','|'},{' ',' ',' '}
        int expected = 0;
        AccountNumber.setDigit(expected,matrixThree);
    }

}
