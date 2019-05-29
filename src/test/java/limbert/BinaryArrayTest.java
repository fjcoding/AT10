package limbert;
import static org.junit.Assert.*;
import org.junit.Test;
import binaries.limbert.BinaryArray;
public class BinaryArrayTest {
    @Test
    public void ConvertToDecimalInt_resultEmpty(){
        int expected = 0;
        BinaryArray binary = new BinaryArray(new int[] { });
        int actual = binary.ConvertToDecimalInt();
        assertEquals(expected,actual);
    }
    @Test
    public void ConvertToDecimalInt_result43(){
        int expected = 43;
        BinaryArray binary = new BinaryArray(new int[] {1, 0, 1, 0, 1, 1});
        int actual = binary.ConvertToDecimalInt();
        assertEquals(expected,actual);
    }
}