package binaries.josue;

import static org.junit.Assert.*;

import org.junit.Test;

import binaries.limbert.BinaryArray;
import jdk.nashorn.internal.AssertsEnabled;

public class BinaryArrayTest {
    @Test
    public void ConvertToDecimalInt_result43{
        BinaryArray expeted = new BinaryArray(new int[] {1 0 1 0 1 1});
        assertsEquals(43,expeted.ConvertToDecimalInt());
        
    }
}