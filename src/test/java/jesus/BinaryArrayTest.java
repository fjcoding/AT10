
package binaries.jesus;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryArrayTest {

    BinaryArray actualbinaryArray;

    @Test (expected = IllegalArgumentException.class)
    public void binary_comvertToDeciamValueNll_resultMistake() throws Exception {
        (new BinaryArray(new int[]{})).ConvertToDecimalInt();
    }

    @Test (expected = IllegalArgumentException.class)
    public void binary_mistakevaluenegative_resultMistake() throws Exception {
        (new BinaryArray(new int[]{-1,2,-4})).ConvertToDecimalInt();
    }

    @Test
    public void binary_comvertToDeciam_result1() throws Exception {
        int expected = 1;
        int[] act={0,0,0,1};
        actualbinaryArray= new BinaryArray(act);
        assertEquals(expected, actualbinaryArray.ConvertToDecimalInt());
        System.out.println(actualbinaryArray.ConvertToDecimalInt());

    }

    @Test
    public void binary_comvertToDeciam_result2() throws Exception {
        int expected = 2;
        int [] actual = {0,0,1,0};
        actualbinaryArray= new BinaryArray(actual);
        assertEquals(expected, actualbinaryArray.ConvertToDecimalInt());
    }

    @Test
    public void binary_comvertToDeciam_result5() throws Exception {
        int expected = 5;
        int [] actual = {0,1,0,1};
        actualbinaryArray= new BinaryArray(actual);
        assertEquals(expected, actualbinaryArray.ConvertToDecimalInt());
    }

    @Test
    public void binary_comvertToDeciam_result9() throws Exception {
        int expected = 9;
        int [] actual = {1,0,0,1};
        actualbinaryArray= new BinaryArray(actual);
        assertEquals(expected, actualbinaryArray.ConvertToDecimalInt());
    }

    @Test
    public void binary_comvertToDeciam_resultc2() throws Exception {
        int expected = 2;
        int [] actual = {0,0,1,0};
        actualbinaryArray= new BinaryArray(actual);
        assertEquals(expected, actualbinaryArray.ConvertToDecimalInt());
    }

    @Test
    public void binary_comvertToDeciam_result6() throws Exception {
        int expected = 6;
        int [] actual = {0,1,1,0};
        actualbinaryArray= new BinaryArray(actual);
        assertEquals(expected, actualbinaryArray.ConvertToDecimalInt());
    }

    @Test
    public void binary_comvertToDeciam_result15() throws Exception {
        int expected = 15;
        int [] actual = {1,1,1,1};
        actualbinaryArray= new BinaryArray(actual);
        assertEquals(expected, actualbinaryArray.ConvertToDecimalInt());
    }

}