package binaries.limbert;

public class AccountNumber {
    int [] digits;
    public AccountNumber() {
        digits = new int[] {1,2,3,4,5,6,7,8,9}; 
    }
    public int getDigit(int position) {
        return digits[position];
    }
}
