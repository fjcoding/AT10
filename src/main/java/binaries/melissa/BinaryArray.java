package binaries.melissa;

import java.lang.Math;

public class BinaryArray {

    /**
     * Array of 1s and 0s expected
     */
    private int[] binaries;

    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public BinaryArray(int[] binaries) {
        this.binaries = binaries;
    }

    /**
     * Returns the decimal numeric value equivalent to the list of binaries stored
     */
    public int ConvertToDecimalInt() {
        int decimal = 0;
        final int BASE_NUMBER = 2;
        double powOfTwo;
        for (int index = 0; index < binaries.length; index++) {
            powOfTwo = Math.pow(BASE_NUMBER, (binaries.length - 1) - index);
            decimal = decimal + binaries[index] * (int) powOfTwo;
        }
        return decimal;
    }
}