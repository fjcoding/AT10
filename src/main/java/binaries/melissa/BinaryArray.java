package binaries.melissa;

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
		double powOfTwo;
		for (int i = 0; i <binaries.length ; i++) {
			powOfTwo = Math.pow(2, binaries.length-i-1);
			decimal = decimal + binaries[i] * (int) powOfTwo;
		}
		return decimal;
    }
}