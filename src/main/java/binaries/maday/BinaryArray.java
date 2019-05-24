package binaries.maday;

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
        int potencia = binaries.length-1;
		int decimal = 0;		
		for (int i : binaries) {
			int convertidos= i*(int)(Math.pow(2, potencia));
			decimal = decimal + convertidos;
			potencia--;
		}
		return decimal;
    }
}