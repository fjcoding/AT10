import static org.junit.Assert.*;

import org.junit.Test;

public class MailClientTest {

    @Test
    public void connectServer_resultTrue () {
        Server server = new Server();
        MailClient client = new MailClient();
        server.addClient(client);
        boolean actual  = client.connectServer(server);
        boolean expected = true;
        assertEquals(expected, actual);
        
    } 
}