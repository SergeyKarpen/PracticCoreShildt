package main.java.com.sergeykarpen.javacore.patterns.structural.bridge;

public class BridgeApp {
    public static void main(String[] args) {

        OS os = new Android(new Tablet());
        os.showWork();
    }
}
