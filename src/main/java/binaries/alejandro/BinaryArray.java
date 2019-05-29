package binaries.alejandro;

public class BinaryArray extends DigitArray {

    /**
     * Simple constructor that assigns binaries list to instace's state
     */
    public BinaryArray(int[] digits) {
        this.base = 2;
        this.digits = digits;
    }
}
