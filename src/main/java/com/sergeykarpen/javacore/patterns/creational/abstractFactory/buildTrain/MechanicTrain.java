package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildTrain;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Mechanic;

public class MechanicTrain implements Mechanic {
    @Override
    public void collect() {
        System.out.println("Making a new train");
    }
}
