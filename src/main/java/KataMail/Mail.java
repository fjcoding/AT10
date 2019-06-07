public class Mail {

    private Integer id;

    public Mail() {

    }

    public Mail(int id) {
        this.id = id;
    }

    public boolean equals(Mail mail) {
        return id.equals(mail.id);
    }
}