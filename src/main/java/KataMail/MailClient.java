public class MailClient {
    private String address;

    public MailClient(String address) {
        this.address = address;
    }

    public MailClient() {

    }

    public boolean connectServer(Server server) {
        return server.verifyClient(this);
    }
    
    public boolean equals(MailClient client) {
        return address.equals(client.address);
    }

}