package bankocr;

public enum Digit {

    ZERO  (" _ ", 
           "| |", 
           "|_|", 0),
    ONE   ("   ", 
           "  |", 
           "  |", 1),
    TWO   (" _ ", 
           " _|", 
           "|_ ", 2),
    THREE (" _ ", 
           " _|", 
           " _|", 3),
    FOUR  ("   ", 
           "|_|", 
           "  |", 4),
    FIVE  (" _ ", 
           "|_ ", 
           " _|", 5),
    SIX   (" _ ", 
           "|_ ", 
           "|_|", 6),
    SEVEN (" _ ", 
           "  |", 
           "  |", 7),
    EIGHT (" _ ", 
           "|_|", 
           "|_|", 8),
    NINE  (" _ ", 
           "|_|", 
           " _|", 9);

    public final String head;
    public final String body;
    public final String foot;
    public final int intMode;

    Digit(String head, String body, String foot, int intMode) {
        this.head = head;
        this.body = body;
        this.foot = foot;
        this.intMode = intMode;
    }
}