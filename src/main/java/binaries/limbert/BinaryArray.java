package binaries.limbert;

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
     * 
     * @throws Exception
     */
    public int ConvertToDecimalInt() throws IllegalArgumentException {
        int vector_length = binaries.length;
        int decimal_number = 0;
        int base = 2;
        for (int vector_position = vector_length - 1; vector_position >= 0; vector_position--) {
            if((binaries[vector_position]>=0) && (binaries[vector_position]<=1)){
                decimal_number = decimal_number + binaries[vector_position] * (int) Math.pow(base, vector_length - 1 - vector_position);
            } else {
                throw new IllegalArgumentException("Dato no valido");
            }
        }
        return decimal_number;
    }
}