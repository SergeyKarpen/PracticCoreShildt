package main.java.com.sergeykarpen.javacore.patterns.creational.factory;

public class Train implements Transport {
    @Override
    public void drive() {
        System.out.println("The new train is ready!");
    }
}
