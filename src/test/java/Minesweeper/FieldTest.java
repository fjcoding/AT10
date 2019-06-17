package Minesweeper;

import static org.junit.Assert.*;

import org.junit.Test;

public class FieldTest {

    @Test
    public void getMineNeighbors_3correctResult() {
        Character[][] fieldNeighbors = {{' ','*',' '},{' ','t','*'},{' ',' ','*'}};
        Field field = new Field(fieldNeighbors);
        Integer expected = 3;
        Integer actual = field.getMineNeighbors(); 
        assertEquals(expected, actual);                
    }
}
