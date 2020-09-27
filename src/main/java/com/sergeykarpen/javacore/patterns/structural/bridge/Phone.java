package main.java.com.sergeykarpen.javacore.patterns.structural.bridge;

public class Phone implements Device {
    @Override
    public void setDevice() {
        System.out.println("Телефон работает!..");
    }
}
