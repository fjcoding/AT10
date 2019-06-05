import static org.junit.Assert.*;
import org.junit.Test;

public class MailClientTest {
    @Test
    public void getUserName_getJose_resultJose() {
        MailClient jose = new MailClient("Jose");
        assertEquals("Jose", jose.getUsername());
    }


}