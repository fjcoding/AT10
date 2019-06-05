import static org.junit.Assert.*;

import org.junit.Test;

public class ServerTest {

    @Test
    public void verifyClient_server_resultFalse () {
        Server server = new Server();
        MailClient client = new MailClient();
        boolean actual  = server.verifyClient(client);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void addClient_resultTrue(){
        Server server = new Server();
        MailClient client = new MailClient();
        server.addClient(client);
        boolean actual  = server.verifyClient(client);
        boolean expected = true;
        assertEquals(expected, actual);
    }
      
    
    
}