package minesweeper;

public class Head {
	String head;
	String lines;
	String columns;
	String [] linesColumns;
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
		return head.substring(2, 3);
	}
}
