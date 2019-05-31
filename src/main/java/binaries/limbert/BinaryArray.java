package binaries.limbert;

public class BinaryArray {

    /**
     * Array of 1s and 0s expected
     */
    private int[] binaries;
    String hexadecimal;

    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public BinaryArray(int[] binaries) {
        this.binaries = binaries;
    }

    public BinaryArray(String hexadecimal){
        this.hexadecimal = hexadecimal;
    }
    /**
     * Returns the decimal numeric value equivalent to the list of binaries stored
     * 
     * @throws Exception
     */
    public int ConvertToDecimalInt() {
        int vector_length = binaries.length;
        int decimal_number = 0;
        int base = 2;
        for (int vector_position = vector_length - 1; vector_position >= 0; vector_position--) {
            decimal_number = decimal_number + binaries[vector_position] * (int) Math.pow(base, vector_length - 1 - vector_position);
        }
        return decimal_number;
    }

    public int HexadecimalToDecimal(){  
        String digits = "0123456789ABCDEF";  
        hexadecimal = hexadecimal.toUpperCase();  
        int value = 0;  
        for (int index = 0; index < hexadecimal.length(); index++) {  
            char character = hexadecimal.charAt(index);  
            int digit = digits.indexOf(character);  
            value = 16*value + digit;  
        }
        return value;  
    }
}