package mail_sender;
import static org.junit.jupiter.api.Assertions.*;


class ClientTest {
    Client client;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client("Ben", Gender.MALE, 45, "hello@a.bc");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals(client.getName(), "Ben");
    }

    @org.junit.jupiter.api.Test
    void getSex() {
        assertEquals(client.getSex(), Gender.MALE);
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(client.getAge(), 45);
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(client.getEmail(), "hello@a.bc");
    }
}