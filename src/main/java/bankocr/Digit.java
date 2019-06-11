package bankocr;

public class Digit {

    public static final String ZERO_STRING = 
        " _ " +
        "| |" +
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
            default: return -1;
        }
    }
}