package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildBus;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Mechanic;

public class MechanicBus implements Mechanic {
    @Override
    public void collect() {
        System.out.println("Making a new bus");
    }
}
