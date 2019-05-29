package binaries.melissa;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {

    @Test
    public void ConvertToDecimalInt_validInput101011_correctResult() {
        int[] array = { 1, 0, 1, 0, 1, 1 };
        BinaryArray binary = new BinaryArray(array);
        assertEquals(43, binary.ConvertToDecimalInt());
    }

    @Test
    public void ConvertToDecimalInt_validInput101011001_correctResult() {
        int[] array = { 1, 0, 1, 0, 1, 1, 0, 0, 1 };
        BinaryArray binary = new BinaryArray(array);
        assertEquals(345, binary.ConvertToDecimalInt());
    }

    @Test
    public void ConvertToDecimalInt_validInputEmptyArray_correctResult() {
        int[] array = {};
        BinaryArray binary = new BinaryArray(array);
        assertEquals(0, binary.ConvertToDecimalInt());
    }

    @Test
    public void isValid_validInput_correctResult() {
        int[] array = { 1, 0, 1, 1 };
        BinaryArray binary = new BinaryArray(array);
        assertTrue(binary.isValid());
    }

    @Test
    public void isValid_InvalidInput_correctResult() {
        int[] array = { 1, 0, 1, 2 };
        BinaryArray binary = new BinaryArray(array);
        assertFalse(binary.isValid());
    }

    @Test(expected = Exception.class)
    public void ConvertToDecimalInt_invalidInPutShouldThrowException() {
        int[] array = { 1, 0, 1, 2 };
        BinaryArray binary = new BinaryArray(array);
        binary.ConvertToDecimalIntInoutValidation();
    }

    @Test
    public void ConvertToDecimalInt_invalidInputShouldThrowException_correctMessage() {
        try {
            int[] array = { 1, 0, 1, 0, 1, 1, 3, 0, 1 };
            BinaryArray binary = new BinaryArray(array);
            binary.ConvertToDecimalIntInoutValidation();
        } catch (Exception e) {
            String expected = "Invalid input";
            String actual = e.getMessage();
            assertEquals(expected, actual);
        }
    }
}