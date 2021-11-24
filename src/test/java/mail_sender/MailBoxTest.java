package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {

    MailBox mailBox;
    MailInfo mailInfo;
    Client client;
    MailCode mailCode;
    ArrayList<MailInfo> mails = new ArrayList<>();

    @BeforeEach
    void setUp() {
        mailBox = new MailBox();
        mailCode = MailCode.HAPPY_BIRTHDAY;
        client = new Client("Ben", Gender.MALE, 45, "hello@a.bc");
        mailInfo = new MailInfo(client, mailCode);
    }

    @Test
    void addMailInfo() {
        mailBox.addMailInfo(mailInfo);
        mails.add(mailInfo);
        assertEquals(mailBox.getInfos().get(0).getEmail(), mails.get(0).getEmail());
    }

}