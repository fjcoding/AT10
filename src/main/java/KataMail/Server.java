import java.util.ArrayList;
import java.util.List;

public class Server {
    private List<MailClient> clients;
    private List<Mail> mails;

    public Server() {
        clients = new ArrayList<MailClient>();
        mails = new ArrayList<Mail>();
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

    public void addClient(MailClient client) {
        clients.add(client);
    }
    
    public boolean verifyMail(Mail mail) {
        boolean answer = false;
        for (int index = 0; index < mails.size(); index++) {
            if (mails.get(index).equals(mail)) {
                answer = true;
                break;
            }
        }
        return answer;
    }
}