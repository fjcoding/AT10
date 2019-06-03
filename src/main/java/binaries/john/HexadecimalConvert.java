package binaries.john;

public class HexadecimalConvert {
    private String hexadecimalNumber;

    public HexadecimalConvert(String hexadecimalNumber) {
        this.hexadecimalNumber = hexadecimalNumber;
    }

    public long ConvertHexadecimal() {
        try {
            String hex = hexadecimalNumber;
            long number = 0;
            Double pow;
            final int BASE = 16;
            for (int position = 0; position < hex.length(); position++) {
                char getCharacter = hexadecimalNumber.charAt(position);
                pow = Math.pow(BASE, (hexadecimalNumber.length() - 1) - position);
                number = (long) (number + Character.getNumericValue(getCharacter) * (Double) pow);
            }
            return number;
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid value");
        }
    }
}