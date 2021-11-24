package mail_sender;

public class Main {

    public static void main(String[] args) {


        MailBox mailBox = new MailBox();
        Client client1 = new Client("Arman", Gender.MALE, 30, "hello@gmail.com");
        Client client2 = new Client("Julia", Gender.FEMALE, 20, "hello2@gmail.com");
        MailInfo mailInfo1 = new MailInfo(client1, MailCode.HAPPY_BIRTHDAY);
        MailInfo mailInfo2 = new MailInfo(client2, MailCode.GREETINGS);
        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);
        mailBox.sendAll();

    }
}
