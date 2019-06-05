import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<MailClient> clients;

    public Server() {
        clients = new ArrayList<MailClient>();
    }

    public boolean verifyClient(MailClient client) {
        boolean answer = false;
        for (int index = 0; index < clients.size(); index++) {
            if (clients.get(index).equals(client)) {
                answer = true;
                break;
            }
        }
        return answer;
    }
}