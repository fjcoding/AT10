package minesweeper;

public class Head {
	String head;

	public Head(String head) {
		this.head = head;
	}
	public String lines() {
		return head.substring(0,1);
	}
}
