package binaries.alejandro;

abstract public class DigitArray {

    int base;

    /**
     * Array of 1s and 0s expected
     */ 
    protected int[] digits;

    /**
     * Returns the decimal numeric value equivalent to the list of binaries stored
     */
    public int ConvertToDecimalInt() {
        if (digits.length != 0) {
            int result = 0;
            int upperLimit = digits.length - 1;
            int lowerLimit = 0;
            for (int arrayIndex = upperLimit; arrayIndex >= lowerLimit; arrayIndex--) {
                if ((digits[arrayIndex] >= 0) && (digits[arrayIndex] < base)) {
                    result += (digits[arrayIndex]) * (Math.pow(base, upperLimit - arrayIndex));
                }
                else {
                    throw new IllegalArgumentException("Error: Invalid digits were entered!");
                }
            }
            return result;
        }
        else {
            throw new IllegalArgumentException("Caution: No digits were entered!");
        }
    }
}
