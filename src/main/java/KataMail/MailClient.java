public class MailClient {
    public boolean connectServer(String username, Server server) {
        return server.receiveClient(username);
    }
}