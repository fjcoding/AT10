import static org.junit.Assert.*;

import org.junit.Test;

public class MailClientTest {

    @Test
    public void connect_server_resultTrue () {
        Server server = new Server();
        MailClient client = new MailClient();
        boolean actual  = client.connect(server);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    
}