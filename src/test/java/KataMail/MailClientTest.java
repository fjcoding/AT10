import static org.junit.Assert.*;

import org.junit.Test;

public class MailClientTest {
    @Test
    public void connectServer_resultTrue() {
        MailClient client = new MailClient();
        Server server = new Server();
        assertEquals(true, client.connectServer("pepitogrillo", server));
    }
}