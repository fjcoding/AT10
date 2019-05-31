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

            if (index == "a" || index == "A")
                auxiliar = 10;

            else if (index == "b" || index == "B")
                auxiliar = 11;

            else if (index == "c" || index == "C")
                auxiliar = 12;

            else if (index == "d" || index == "D")
                auxiliar = 13;

            else if (index == "e" || index == "E")
                auxiliar = 14;

            else if (index == "f" || index == "F")
                auxiliar = 15;

            else
                auxiliar = Integer.parseInt(index);
            decimal = decimal + (auxiliar * (int) (Math.pow(BASE, power)));
            power--;
        }
        return decimal;
    }
}
