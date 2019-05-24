package binaries.alejandro;

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
		for (int i=binaries.length-1; i>0; i--) {
			result += (binaries[i])*(Math.pow( 2,binaries.length - 1 - i));
		}
		return result;
    }
}