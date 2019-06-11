package bankocr;

public class Digit {

    public static final String ZERO_STRING = 
        " _ " +
        "| |" +
        "|_|";

    public static final String ONE_STRING = 
        "   " +
        "  |" +
        "  |";

    public static final String TWO_STRING = 
        " _ " +
        " _|" +
        "|_ ";

    public static final String THREE_STRING = 
        " _ " +
        " _|" +
        " _|";

    public static final String FOUR_STRING = 
        "   " +
        "|_|" +
        "  |";

    public static final String FIVE_STRING = 
        " _ " +
        "|_ " +
        " _|";

    public static final String SIX_STRING = 
        " _ " +
        "|_ " +
        "|_|";

    private String head;
    private String body;
    private String foot;

    public Digit (String head, String body, String foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    public int getIntValue() {
        String digitString = head + body + foot;
        switch (digitString) {
            case ZERO_STRING: return 0;
            case ONE_STRING: return 1;
            case TWO_STRING: return 2;
            case THREE_STRING: return 3;
            case FOUR_STRING: return 4;
            case FIVE_STRING: return 5;
            case SIX_STRING: return 6;
            default: return -1;
        }
    }
}