package binaries.maday;

public class HexadecimalArray {
    /**
     * Array of hexadecimal numbers expected
     */
    private String[] hexadecimal;

    /**
     * Simple constructor that assigns hexadecimal list to instace's state
     */
    public HexadecimalArray(String[] hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    /**
     * Returns the decimal numeric value equivalent to the list of hexadecimal stored
     */
    public int ConvertToDecimalInt() {
        final int BASE = 16;
        int auxiliar;
        int power = hexadecimal.length - 1;
        int decimal = 0;
        for (String index : hexadecimal) {
            auxiliar = Integer.parseInt(index,BASE);
            decimal = decimal + (auxiliar * (int) (Math.pow(BASE, power)));
            power--;
        }
        return decimal;
    }
}
