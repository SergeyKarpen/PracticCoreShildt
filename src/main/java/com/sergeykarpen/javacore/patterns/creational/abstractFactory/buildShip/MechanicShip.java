package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildShip;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Mechanic;

public class MechanicShip implements Mechanic {
    @Override
    public void collect() {
        System.out.println("Making a new ship");
    }
}
