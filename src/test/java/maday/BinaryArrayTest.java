package binaries.maday;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryArrayTest {
    BinaryArray binaryArray;

    @Test
    public void ConvertToDecimalInt_EmptyArray_Result() {
        binaryArray = new BinaryArray(new int[]{});
        int expected = 0;
        int actual = binaryArray.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

    @Test
    public void ConvertToDecimalInt_ArrayWithValidData_Result43() {
        binaryArray = new BinaryArray(new int[]{1, 0, 1, 0, 1, 1});
        int expected = 43;
        int actual = binaryArray.ConvertToDecimalInt();
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void ConvertToDecimalInt_ExceptionExpected_ResultCaptureException() {
        binaryArray = new BinaryArray(new int[]{0, 2, 6, 25});
        String expected = "Error de conversion, no son Binarios.";
        int actual = binaryArray.ConvertToDecimalInt();
        assertEquals(expected, actual);


    }
}