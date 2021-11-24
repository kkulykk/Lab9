package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        String file = "hello.jpg";
        Image image = new ProxyImage(file);
        image.display();
    }
}
