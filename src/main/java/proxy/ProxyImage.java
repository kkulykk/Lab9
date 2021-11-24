package proxy;

import lombok.Getter;

@Getter
public class ProxyImage implements Image{
    private RealImage realImage;
    private final String filename;

    public ProxyImage(String file) {
        filename = file;
    };

    @Override
    public void display() {
        if (realImage==null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
