package binaries.melissa;

public class HexadecimalArray {
    /**
     * Array of 1s and 0s expected
     */
    private char[] hexadecimals;

    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public HexadecimalArray(char[] hexadecimals) {
        this.hexadecimals = hexadecimals;
    }

    /**
     * Verifies if BinaryArray corresponds to an actual binary number.
     * 
     * @return
     */
    public boolean isValid() {
        boolean answer = true;
        for (int index = 0; index < hexadecimals.length; index++) {
            if (Character.getNumericValue(hexadecimals[index]) < 0 || Character.getNumericValue(hexadecimals[index]) > 15) {
                answer = false;
            }
        }
        return answer;
    }

    /**
     * Returns the decimal numeric value equivalent to the list of binaries stored
     */
    public int ConvertToDecimalInt() {
        int decimal = 0;
        final int BASE_NUMBER = 16;
        double powOfSixteen;
        for (int index = 0; index < hexadecimals.length; index++) {
            powOfSixteen = Math.pow(BASE_NUMBER, (hexadecimals.length - 1) - index);
            decimal = decimal + Character.getNumericValue(hexadecimals[index]) * (int) powOfSixteen;
        }
        return decimal;
    }

    /**
     * Returns the decimal numeric value equivalent to the list of binaries stored
     * if the input is an actual binary number, in case it is not throws an
     * Exception message     
     * @return
     */
    public int ConvertToDecimalIntInoutValidation() {
        if (isValid()) {
            int decimal = 0;
            final int BASE_NUMBER = 16;
            double powOfSixteen;
            for (int index = 0; index < hexadecimals.length; index++) {
                powOfSixteen = Math.pow(BASE_NUMBER, (hexadecimals.length - 1) - index);
                decimal = decimal + Character.getNumericValue(hexadecimals[index]) * (int) powOfSixteen;
            }
            return decimal;
        } else {
            throw new UnsupportedOperationException("Invalid input");
        }
    }
}
