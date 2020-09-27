package main.java.com.sergeykarpen.javacore.patterns.structural.proxy;

public class ProxyApp {
    private static final String pathFileInput= "D:/images/";

    public static void main(String[] args) {
        LoadFile loadFile = new ProxyFile(pathFileInput);
        loadFile.showOnScreen();
    }
}
