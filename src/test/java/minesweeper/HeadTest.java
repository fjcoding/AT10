package minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeadTest {

	@Test
	public void lines_23_result2() {
		Head head = new Head("2 3");
		String excepted = "2";
		head.linesColumns();
		assertEquals(excepted, head.lines());
	}
	@Test
	public void columns_23_result3() {
		Head head = new Head("2 3");
		String excepted = "3";
		assertEquals(excepted, head.columns());
	}
}
