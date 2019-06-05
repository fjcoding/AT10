public class MailClient {
    public boolean connectServer(Server server){
        return server.verifyClient(this);
    }
}