package minesweeper;

public class Head {
    String head;
    String lines;
    String columns;
    String[] linesColumns;
    public Head(String head) {
        this.head = head;
    }
    public String[] linesColumns() {
        linesColumns = head.split(" ");
        return linesColumns;
    }
    public String lines() {
        return linesColumns[0];
    }
    public String columns() {
        return linesColumns[1];
    }
    public boolean correctValues() {
        boolean result = false;
        if (Integer.parseInt(lines) > 0 && Integer.parseInt(lines) < 100) {
            if (Integer.parseInt(columns) > 0
                    && Integer.parseInt(columns) < 100) {
                result = true;
            }
        }
        return result;
    }
}