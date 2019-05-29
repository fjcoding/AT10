package binaries.melissa;

import static org.junit.Assert.*;

import org.junit.Test;

public class HexadecimalArrayTest {

    @Test
    public void ConvertToDecimalInt_validInputABCE12_correctResult() {
        char[] array = { 'A', 'B', 'C', 'E', '1', '2' };
        HexadecimalArray hexa = new HexadecimalArray(array);
        assertEquals(11259410, hexa.ConvertToDecimalInt());
    }

    
    @Test
    public void ConvertToDecimalInt_validInput123456_correctResult() {
        char[] array = { '1', '2', '3', '4', '5', '6' };
        HexadecimalArray hexa = new HexadecimalArray(array);
        assertEquals(1193046, hexa.ConvertToDecimalInt());
    }
    
    @Test
    public void ConvertToDecimalInt_validInput4D5_correctResult() {
        char[] array = { '4', 'D', '5' };
        HexadecimalArray hexa = new HexadecimalArray(array);
        assertEquals(1237, hexa.ConvertToDecimalInt());
    }
    

    @Test
    public void isValid_validInput_correctResult() {
        char[] array = { 'A', 'B', 'C', 'E', '1', '2' };
        HexadecimalArray hexa = new HexadecimalArray(array);
        assertTrue(hexa.isValid());
    }
    
    @Test
    public void isValid_invalidInput_correctResult() {
        char[] array = { 'A', 'B', 'C', 'G', '1', '2' };
        HexadecimalArray hexa = new HexadecimalArray(array);
        assertFalse(hexa.isValid());
    }
    
    @Test(expected = Exception.class)
    public void ConvertToDecimalInt_invalidInputShouldThrowException() {
        char[] array = { 'A', 'B', 'C', 'G', '1', '2' };
        HexadecimalArray hexa = new HexadecimalArray(array);
        hexa.ConvertToDecimalIntInoutValidation();
    }

    @Test
    public void ConvertToDecimalInt_invalidInputShouldThrowException_correctMessage() {
        try {
            char[] array = { 'A', 'B', 'C', 'G', '1', '2' };
            HexadecimalArray hexa = new HexadecimalArray(array);
            hexa.ConvertToDecimalIntInoutValidation();
        } catch (Exception e) {
            String expected = "Invalid input";
            String actual = e.getMessage();
            assertEquals(expected, actual);
        }
    }
}
