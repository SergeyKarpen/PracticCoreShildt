package main.java.com.sergeykarpen.javacore.patterns.structural.bridge;

public class Tablet implements Device {
    @Override
    public void setDevice() {
        System.out.println("Планшет работает!..");
    }
}
