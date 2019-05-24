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
        //throw new UnsupportedOperationException("Not supported yet.");
    	  int exp = 0;
          double decimal = 0;

          for(int i = 0; i < binaries.length; i++) {
               decimal = decimal + (binaries[(binaries.length -1) - i] * (int)Math.pow(2, i));              
          }
		return (int) decimal;
    }
}