package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildShip;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Designer;

public class DesignerShip implements Designer {
    @Override
    public void makesProject() {
        System.out.println("Designing a new ship");
    }
}
