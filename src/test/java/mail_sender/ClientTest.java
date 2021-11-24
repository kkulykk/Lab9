package mail_sender;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {
    Client client;

    @BeforeEach
    void setUp() {
        client = new Client("Ben", Gender.MALE, 45, "hello@a.bc");
    }

    @Test
    void getName() {
        assertEquals(client.getName(), "Ben");
    }

    @Test
    void getSex() {
        assertEquals(client.getSex(), Gender.MALE);
    }

    @Test
    void getAge() {
        assertEquals(client.getAge(), 45);
    }

    @Test
    void getEmail() {
        assertEquals(client.getEmail(), "hello@a.bc");
    }
}