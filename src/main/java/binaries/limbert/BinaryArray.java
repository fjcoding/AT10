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
     */
    public int ConvertToDecimalInt() {
        //throw new UnsupportedOperationException("Not supported yet.");
    	int longitud = binaries.length;
		int dec = 0;
		for (int i = longitud-1; i > 0; i--) {
			dec = dec+binaries[i] * (int) Math.pow(2, longitud-1 - i);
		}
		return dec;
    }
}