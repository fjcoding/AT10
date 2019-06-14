package BankOCR;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

    Digit zero = new Digit(Digit.ZERO);
    Digit one = new Digit(Digit.ONE);
    Digit two = new Digit(Digit.TWO);
    Digit three = new Digit(Digit.THREE);
    Digit four = new Digit(Digit.FOUR);
    Digit five = new Digit(Digit.FIVE);
    Digit six = new Digit(Digit.SIX);
    Digit seven = new Digit(Digit.SEVEN);
    Digit eight = new Digit(Digit.EIGHT);
    Digit nine = new Digit(Digit.NINE);
    Digit A = new Digit(Digit.A);
    Digit B = new Digit(Digit.B);
    Digit C = new Digit(Digit.C);
    Digit D = new Digit(Digit.D);
    Digit E = new Digit(Digit.E);
    Digit F = new Digit(Digit.F);
    
    @Test
    public void convertNumber_29_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(two); 
        accountDigits.add(nine); 
        Account account = new Account(accountDigits);
        assertEquals("29", account.convertNumber());
    }

    @Test
    public void convertNumber_00_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        Account account = new Account(accountDigits);
        assertEquals("00", account.convertNumber());
    }

    @Test
    public void convertNumber_000098765_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(nine); 
        accountDigits.add(eight); 
        accountDigits.add(seven); 
        accountDigits.add(six); 
        accountDigits.add(five); 
        Account account = new Account(accountDigits);
        assertEquals("000098765", account.convertNumber());
    }

    @Test
    public void convertNumber_000000000_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        Account account = new Account(accountDigits);
        assertEquals("000000000", account.convertNumber());
    }

    @Test
    public void convertNumber_111111111_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(one); 
        accountDigits.add(one); 
        accountDigits.add(one); 
        accountDigits.add(one); 
        accountDigits.add(one); 
        accountDigits.add(one); 
        accountDigits.add(one); 
        accountDigits.add(one); 
        accountDigits.add(one); 
        Account account = new Account(accountDigits);
        assertEquals("111111111", account.convertNumber());
    }

    @Test
    public void convertNumber_222222222_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(two); 
        accountDigits.add(two); 
        accountDigits.add(two); 
        accountDigits.add(two); 
        accountDigits.add(two); 
        accountDigits.add(two); 
        accountDigits.add(two); 
        accountDigits.add(two); 
        accountDigits.add(two); 
        Account account = new Account(accountDigits);
        assertEquals("222222222", account.convertNumber());
    }

    @Test
    public void convertNumber_333333333_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(three); 
        accountDigits.add(three); 
        accountDigits.add(three); 
        accountDigits.add(three); 
        accountDigits.add(three); 
        accountDigits.add(three); 
        accountDigits.add(three); 
        accountDigits.add(three); 
        accountDigits.add(three); 
        Account account = new Account(accountDigits);
        assertEquals("333333333", account.convertNumber());
    }

    @Test
    public void convertNumber_444444444_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(four); 
        accountDigits.add(four); 
        accountDigits.add(four); 
        accountDigits.add(four); 
        accountDigits.add(four); 
        accountDigits.add(four); 
        accountDigits.add(four); 
        accountDigits.add(four); 
        accountDigits.add(four); 
        Account account = new Account(accountDigits);
        assertEquals("444444444", account.convertNumber());
    }

    @Test
    public void convertNumber_555555555_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(five); 
        accountDigits.add(five); 
        accountDigits.add(five); 
        accountDigits.add(five); 
        accountDigits.add(five); 
        accountDigits.add(five); 
        accountDigits.add(five); 
        accountDigits.add(five); 
        accountDigits.add(five); 
        Account account = new Account(accountDigits);
        assertEquals("555555555", account.convertNumber());
    }

    @Test
    public void convertNumber_666666666_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(six); 
        accountDigits.add(six); 
        accountDigits.add(six); 
        accountDigits.add(six); 
        accountDigits.add(six); 
        accountDigits.add(six); 
        accountDigits.add(six); 
        accountDigits.add(six); 
        accountDigits.add(six); 
        Account account = new Account(accountDigits);
        assertEquals("666666666", account.convertNumber());
    }

    @Test
    public void convertNumber_777777777_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(seven); 
        accountDigits.add(seven); 
        accountDigits.add(seven); 
        accountDigits.add(seven); 
        accountDigits.add(seven); 
        accountDigits.add(seven); 
        accountDigits.add(seven); 
        accountDigits.add(seven); 
        accountDigits.add(seven); 
        Account account = new Account(accountDigits);
        assertEquals("777777777", account.convertNumber());
    }

    @Test
    public void convertNumber_888888888_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(eight); 
        accountDigits.add(eight); 
        accountDigits.add(eight); 
        accountDigits.add(eight); 
        accountDigits.add(eight); 
        accountDigits.add(eight); 
        accountDigits.add(eight); 
        accountDigits.add(eight); 
        accountDigits.add(eight); 
        Account account = new Account(accountDigits);
        assertEquals("888888888", account.convertNumber());
    }

    @Test
    public void convertNumber_999999999_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(nine); 
        accountDigits.add(nine); 
        accountDigits.add(nine); 
        accountDigits.add(nine); 
        accountDigits.add(nine); 
        accountDigits.add(nine); 
        accountDigits.add(nine); 
        accountDigits.add(nine); 
        accountDigits.add(nine); 
        Account account = new Account(accountDigits);
        assertEquals("999999999", account.convertNumber());
    }

    @Test
    public void convertNumber_123456789_correctResult() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(one); 
        accountDigits.add(two); 
        accountDigits.add(three); 
        accountDigits.add(four); 
        accountDigits.add(five); 
        accountDigits.add(six); 
        accountDigits.add(seven); 
        accountDigits.add(eight); 
        accountDigits.add(nine); 
        Account account = new Account(accountDigits);
        assertEquals("123456789", account.convertNumber());
    }
    @Test
    public void checkSum_123456789_correctResult0() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(one); 
        accountDigits.add(two); 
        accountDigits.add(three); 
        accountDigits.add(four); 
        accountDigits.add(five); 
        accountDigits.add(six); 
        accountDigits.add(seven); 
        accountDigits.add(eight); 
        accountDigits.add(nine); 
        Account account = new Account(accountDigits);
        assertEquals(0, account.checkSum());
    }
    @Test
    public void checkSum_000000000_correctResult0() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(zero); 
        accountDigits.add(zero);
        accountDigits.add(zero);
        accountDigits.add(zero);
        accountDigits.add(zero);
        accountDigits.add(zero);
        accountDigits.add(zero);
        accountDigits.add(zero);
        accountDigits.add(zero);
        Account account = new Account(accountDigits);
        assertEquals(0, account.checkSum());
    }
    @Test
    public void checkSum_12_correctResultNot0() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(one); 
        accountDigits.add(two); 
        Account account = new Account(accountDigits);
        assertNotEquals(0, account.checkSum());
    }
    @Test
    public void checkSum_12345_correctResultNot0() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(one); 
        accountDigits.add(two); 
        accountDigits.add(three); 
        accountDigits.add(four); 
        accountDigits.add(five);       
        Account account = new Account(accountDigits);
        assertNotEquals(0, account.checkSum());
    }
    @Test
    public void convertNumber_00009876_correctResultNot0() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(zero); 
        accountDigits.add(nine); 
        accountDigits.add(eight); 
        accountDigits.add(seven); 
        accountDigits.add(six); 
        Account account = new Account(accountDigits);
        assertNotEquals(0, account.checkSum());
    }
    
    @Test
    public void isHexadecimal_True() {
        List<Digit> accountDigits = new ArrayList<>();
        accountDigits.add(zero); 
        accountDigits.add(seven); 
        accountDigits.add(B); 
        accountDigits.add(A); 
        Account account = new Account(accountDigits);
        assertTrue(account.isHexadecimal());
    }
}
