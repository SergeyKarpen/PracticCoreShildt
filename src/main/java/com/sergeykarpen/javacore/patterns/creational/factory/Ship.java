package main.java.com.sergeykarpen.javacore.patterns.creational.factory;

public class Ship  implements Transport{
    @Override
    public void drive() {
        System.out.println("The new ship is ready!");
    }
}
