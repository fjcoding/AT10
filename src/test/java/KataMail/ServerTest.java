import static org.junit.Assert.*;

import org.junit.Test;

public class ServerTest {

    @Test
    public void verifyClient_server_resultFalse() {
        Server server = new Server();
        MailClient client = new MailClient();
        boolean actual = server.verifyClient(client);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void addClient_resultTrue() {
        Server server = new Server();
        MailClient client = new MailClient("abc@bunny.com");
        server.addClient(client);
        boolean actual = server.verifyClient(client);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void verifyMail_server_resultFalse() {
        Server server = new Server();
        Mail mail = new Mail();
        boolean actual = server.verifyMail(mail);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void addMail_resultTrue() {
        Server server = new Server();
        Mail mail = new Mail();
        server.addMail(mail);
        boolean actual = server.verifyMail(mail);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}