package binaries.josue;

public class BinaryArray {
    final int base = 2;
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
     * Returns the decimal numeric value equivalent to the list of binaries
     * stored
     */
    public int ConvertToDecimalInt() {
        int result = 0;
        int cont = 0;
        for (int index = binaries.length - 1; index >= 0; index--) {
        	if(checkIsBinarie(binaries[index])) {
        		result = result + ((int) (Math.pow(base, cont)) * binaries[index]);
                cont++;
        	}else {
        		throw new ArithmeticException("Not binario");
        	}
            
        }
        return result;
    }
    public boolean checkIsBinarie(int number) {
    	boolean result=false;
    	if(number < 2 && number >-1) {
    		result=true;
    	}
    	return result;
    }
}