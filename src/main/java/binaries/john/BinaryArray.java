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
    int[] binario = binaries;
    int number = 0;

        for(int position = 0; position < binario.length - 1 ; position++) {
            number = number + ((binario[(binario.length - 1 ) - position]) * (int)Math.pow(2,position));
        }

        return (int) number;
    }
}
