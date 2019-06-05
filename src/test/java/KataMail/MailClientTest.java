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
    
    @Test
    public void equals_correctResultTrue() {
        MailClient client1 = new MailClient("abc@def.ghi");
        MailClient client2 = new MailClient("abc@def.ghi");
        assertTrue(client1.equals(client2));
    }
    
    @Test
    public void equals_correctResultFalse() {
        MailClient client1 = new MailClient("abc@def.ghi");
        MailClient client2 = new MailClient("xyz@def.ghi");
        assertFalse(client1.equals(client2));
    }
}