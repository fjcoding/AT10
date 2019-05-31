package binaries.jesus;

public class HexadecimalString {

    private String numberHexadecimal="0123";
    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public HexadecimalString(String numberHexadecimal) {
        this.numberHexadecimal = numberHexadecimal;
    }
    /**
     * Returns the decimal numeric value equivalent to the list of binaries stored
     */
    public long ConvertToHexadecimalInt() {
        try{
            return Integer.valueOf(numberHexadecimal, 16);
        }
        catch (Exception e){
            throw new IllegalArgumentException("You input invalid characters");
        }
    }
    public static void main(String arg[]){
        HexadecimalString hexadecimalArray=new HexadecimalString("123ABCDE");
        System.out.println(hexadecimalArray.ConvertToHexadecimalInt());
        System.out.println(Integer.valueOf("AB", 16));
    }
}