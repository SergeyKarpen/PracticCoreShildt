package main.java.com.sergeykarpen.javacore.patterns.creational.factory;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("The new bus is ready!d");
    }
}