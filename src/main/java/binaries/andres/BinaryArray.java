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
            if (binaries[index] == 0 || binaries[index] == 1) {
                result = (result * 2) + binaries[index];
            }else {
                throw new UnsupportedOperationException("Not a binary digit");
            }
            
        }
        return result;
    }
}