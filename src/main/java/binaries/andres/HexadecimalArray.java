package binaries.andres;

public class HexadecimalArray {
    /**
     * String of hexadecimals expected
     */
    private String hexadecimals;

    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public HexadecimalArray(String hexadecimals) {
        this.hexadecimals = hexadecimals;
    }

    /**
     * Returns the decimal numeric value equivalent to the list of hexadecimal stored
     */
    public int ConvertToDecimalInt() {
        String hexadecimalsDigits="0123456789ABCDEF";
        hexadecimals = hexadecimals.toUpperCase();
        int result = 0;
        for (int index = 0; index < hexadecimals.length(); index++)
        {
            char digit = hexadecimals.charAt(index);
            int decimal = hexadecimalsDigits.indexOf(digit);
            result = 16*result + decimal;
        }
        return result;
    }
}
