package proxy;

import lombok.Getter;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
        loadFromDisk();
    }
    @Override
    public void display() {
        System.out.println("Image shown");
    }
    public void loadFromDisk() {
        System.out.println("Image loaded");
    }
}
