import static org.junit.Assert.*;

import org.junit.Test;

public class ServerTest {

    @Test
    public void verifyClient_server_resultTrue () {
        Server server = new Server();
        MailClient client = new MailClient();
        boolean actual  = server.verifyClient(client);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    
}