package binaries.andres;

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
        int result = 0;
        for (int index = 0; index < binaries.length; index++) {
            result = (result * 2) + binaries[index];
        }
        return result;
    }
}