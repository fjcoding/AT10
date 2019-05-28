package binaries.alejandro;

public class BinaryArray {

    final int BIN_BASE = 2;
    final int HEX_BASE = 16;

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
        if (binaries.length != 0) {
            int result = 0;
            int upperLimit = binaries.length - 1;
            int lowerLimit = 0;
            for (int arrayIndex = upperLimit; arrayIndex >= lowerLimit; arrayIndex--) {
                if ((binaries[arrayIndex] >= 0) && (binaries[arrayIndex] < BIN_BASE)) {
                    result += (binaries[arrayIndex]) * (Math.pow(BIN_BASE, upperLimit - arrayIndex));
                }
                else {
                    throw new IllegalArgumentException("Error: Invalid binary digits were entered!");
                }
            }
            return result;
        }
        else {
            throw new IllegalArgumentException("Caution: No digits were entered!");
        }
    }
}
