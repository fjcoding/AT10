package minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class FieldTest {
    
    Integer[][] cells = new Integer[][] {{0,0,0},{0,0,0},{0,0,0}};
    Field field = new Field(cells);
    
    @Test
    public void getValue_result0() {
        assertEquals(0, field.getCellValue(1, 1), 0);
    }
    
    @Test
    public void addNorth_result1() {
        Integer expected = 1;
        field.addNorth(1, 1);
        Integer actual = field.getCellValue(0, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void addSouth_result1() {
        Integer expected = 1;
        field.addSouth(1, 1);
        Integer actual = field.getCellValue(2, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void addWest_result1() {
        Integer expected = 1;
        field.addWest(1, 1);
        Integer actual = field.getCellValue(1, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void addEast_result1() {
        Integer expected = 1;
        field.addEast(1, 1);
        Integer actual = field.getCellValue(1, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void addNorthWest_result1() {
        Integer expected = 1;
        field.addNorthWest(1, 1);
        Integer actual = field.getCellValue(0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void addNorthEast_result1() {
        Integer expected = 1;
        field.addNorthEast(1, 1);
        Integer actual = field.getCellValue(0, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void addSouthWest_result1() {
        Integer expected = 1;
        field.addSouthWest(1, 1);
        Integer actual = field.getCellValue(2, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void addSouthEast_result1() {
        Integer expected = 1;
        field.addSouthEast(1, 1);
        Integer actual = field.getCellValue(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void addNeighbours_result1() {
        Integer[][] cellsNeighbours = new Integer[][] {{0,0,0},{0,0,0},{0,0,0}};
        Field fieldNeighbours = new Field(cellsNeighbours);
        Integer expected = 1;
        fieldNeighbours.addNeighbours(1, 1);
        Integer actual = fieldNeighbours.getCellValue(2, 2);
        assertEquals(expected, actual);
    }
}
