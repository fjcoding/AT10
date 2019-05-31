package binaries.josue;

public class BinaryArray {
    final int BINARIEBASE = 2;
    final int HEXABASE = 16;
    /**
     * Array of 1s and 0s expected
     */
    private String[] binaries;
    private char base;
    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public BinaryArray(String[] binaries, char base) {
        this.binaries = binaries;
        this.base=base;
    }
    /**
     * Returns the decimal numeric value equivalent to the list of binaries
     * stored
     */
    public int ConvertToDecimalInt() {
    	int result = 0;
    	if(base == 'b') {
    		result = binariesToDecimal();
    	}
        if(base == 'h') {
        	result = hexadecimalToDecimal();
        }
        
        return result;
    }
    public int binariesToDecimal() {
    	int result = 0;
        int cont = 0;
        for (int index = binaries.length - 1; index >= 0; index--) {
            result = result + ((int) (Math.pow(BINARIEBASE, cont)) * Integer.parseInt(binaries[index]));
            cont++;
        }
        return result;
    }
    public int hexadecimalToDecimal() {
    	int result = 0;
        int cont = 0;
        for (int index = binaries.length - 1; index >= 0; index--) {
            result = result + ((int) (Math.pow(HEXABASE, cont)) * Integer.parseInt(binaries[index],16));
            cont++;
        }
        return result;
    }
}