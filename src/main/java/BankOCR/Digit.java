package BankOCR;

public class Digit {

    String digits;

    public Digit(String strDigit) {
        this.digits = strDigit;
    }

    public int convertArrays() {
        switch (digits) {
        case " _ | ||_|":
            return 0;
        case "     |  |":
            return 1;
        case " _  _||_ ":
            return 2;
        case " _  _| _|":
            return 3;
        case "   |_|  |":
            return 4;
        case " _ |_  _|":
            return 5;
        case " _ |_ |_|":
            return 6;
        case " _   |  |":
            return 7;
        case " _ |_||_|":
            return 8;
        case " _ |_| _|":
            return 9;
        default:
            return -1;

        }
    }
}
