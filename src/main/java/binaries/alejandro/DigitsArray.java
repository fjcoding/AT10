package binaries.alejandro;

public class DigitsArray {

    /**
     * Array of single strings expected
     */ 
    private String[] binaries;

    /**
     * Simple constructor that assigns binaries list to instance's state
     */
    public DigitsArray(String[] binaries) {
        this.binaries = binaries;
    }

    /**
     *
     * Input:  Character equivalent to the numbering base: 'b' for binary and 'h' for hexadecimal
     * Output: Returns a decimal numeric value equivalent to the list of digits stored
     * 
     */
    public int convertToDecimalInteger(char fromBase) {
        int sourceBase;
        int result = 0;

        if (binaries.length != 0) {
            switch (fromBase) {
                case 'b':
                    sourceBase = 2;
                    break;
            
                case 'h':
                    sourceBase = 16;
                    break;
            
                default:
                    throw new IllegalArgumentException("Invalid base argument or not supported yet!");
            }

            int upperLimit = binaries.length - 1;
            int lowerLimit = 0;
            String stringDigit = "";
            for (int arrayIndex = upperLimit; arrayIndex >= lowerLimit; arrayIndex--) {
                stringDigit = binaries[arrayIndex];
                if (stringDigit.length() == 1) {
                    try {
                    result += (Integer.parseInt(stringDigit, sourceBase)) * (Math.pow(sourceBase, upperLimit - arrayIndex));
                    }
                    catch (NumberFormatException e) {
                        throw new NumberFormatException("Invalid digits or not supported!");
                    }
                }
                else {
                    throw new NumberFormatException("Enter single positive digits only");
                }
            }
            return result;
        }
        else {
            throw new IllegalArgumentException("Caution: No digits were entered!");
        }
    }
}
