package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildBus;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Designer;

public class DesignerBus implements Designer {
    @Override
    public void makesProject() {
        System.out.println("Designing a new bus");
    }
}
