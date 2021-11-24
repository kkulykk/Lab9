package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    ProxyImage proxyImage;


    @BeforeEach
    void setUp() {
        proxyImage = new ProxyImage("proxy");
    }

    @Test
    void getFilename() {
        assertEquals(proxyImage.getFilename(), "proxy");
    }
}