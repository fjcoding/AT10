import static org.junit.Assert.*;

import org.junit.Test;

public class MailTest {
    
    @Test
    public void equalsMail_correctResultFalse() {
        Mail mail1 = new Mail(123);
        Mail mail2 = new Mail(123);
        assertTrue(mail1.equals(mail2));
    }
}