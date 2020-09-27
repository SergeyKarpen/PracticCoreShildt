package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildTrain;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Designer;

public class DesignerTrain implements Designer {
    @Override
    public void makesProject() {
        System.out.println("Designing a new train");
    }
}
