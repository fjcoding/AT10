package BankOCR;

public class Digit {
    final static String ZERO =     " _ "
                                +  "| |"
                                +  "|_|";
    final static String ONE =      "   "
                                +  "  |"
                                +  "  |";
    final static String TWO =      " _ "
                                +  " _|"
                                +  "|_ ";
    final static String THREE =    " _ "
                                +  " _|"
                                +  " _|";
    final static String FOUR =     "   "
                                +  "|_|"
                                +  "  |";
    final static String FIVE =     " _ "
                                +  "|_ "
                                +  " _|";
    final static String SIX =      " _ "
                                +  "|_ "
                                +  "|_|";
    final static String SEVEN =    " _ "
                                +  "  |"
                                +  "  |";
    final static String EIGHT =    " _ "
                                +  "|_|"
                                +  "|_|";
    final static String NINE =     " _ "
                                +  "|_|"
                                +  " _|";

    String digit;

    public Digit(String stringDigit) {
        this.digit = stringDigit;
    }

    public int convertArrays() {
        switch (digit) {
        case ZERO:
            return 0;
        case ONE:
            return 1;
        case TWO:
            return 2;
        case THREE:
            return 3;
        case FOUR:
            return 4;
        case FIVE:
            return 5;
        case SIX:
            return 6;
        case SEVEN:
            return 7;
        case EIGHT:
            return 8;
        case NINE:
            return 9;
        default:
            return -1;
        }
    }
}
