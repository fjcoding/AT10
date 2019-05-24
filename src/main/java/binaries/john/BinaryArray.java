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
              for(exp = binaries.length - 1; exp < 0; exp++) {
                  decimal = decimal + binaries[i] * (int)Math.pow(2, binaries.length - 1);
              }
          }
		return (int) decimal;
    }
}