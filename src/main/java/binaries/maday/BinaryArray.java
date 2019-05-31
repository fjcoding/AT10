package binaries.maday;

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
        int power = binaries.length - 1;
        int decimal = 0;
        for (int index : binaries) {
            if (verifyBinarie(index)) {
                int converted = index * (int) (Math.pow(BASE, power));
                decimal = decimal + converted;
                power--;
            } else {
                throw new ArithmeticException("Not Binaries");
            }
        }
        return decimal;
    }

    public boolean verifyBinarie(int number) {
        boolean result = false;
        if (number < 2 && number > -1) {
            result = true;
        }
        return result;
    }
}