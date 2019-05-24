package binaries.alejandro;

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
        final int BASE = 2;
        int result = 0;
        int upperLimit = binaries.length - 1;
        int lowerLimit = 0;
        for (int arrayIndex = upperLimit; arrayIndex > lowerLimit; arrayIndex--) {
            result += (binaries[arrayIndex]) * (Math.pow(BASE, upperLimit - arrayIndex));
        }
        return result;
    }
}