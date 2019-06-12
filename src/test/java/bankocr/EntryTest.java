package bankocr;

import org.junit.Test;
import static org.junit.Assert.*;
import static bankocr.Digit.*;

public class EntryTest {

    @Test
    public void getEntryAsIntsZeroes_shouldReturnZeroes() {
        Entry entryAllZeroes = new Entry(ZERO, ZERO, ZERO, ZERO, ZERO, ZERO, ZERO, ZERO, ZERO);
        String expected = "000000000";
        assertEquals(expected, entryAllZeroes.asNumbers());
    }
}