package binaries.john;

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
        int[] binary = binaries;
        int number = 0;
        for(int position = 0; position < binary.length - 1 ; position++) {
            number = number + ((binary[(binary.length - 1 ) - position]) * (int)Math.pow(2,position));
        }
        return number;
    }
}
