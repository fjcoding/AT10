package binaries.alejandro;

public class HexArray extends DigitArray {
    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public HexArray(int[] digits) {
        this.base = 16;
        this.digits = digits;
    }
}
