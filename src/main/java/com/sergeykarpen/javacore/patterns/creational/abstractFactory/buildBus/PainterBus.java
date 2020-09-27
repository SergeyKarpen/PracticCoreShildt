package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildBus;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Painter;

public class PainterBus implements Painter {
    @Override
    public void paints() {
        System.out.println("Paint the bus");
    }
}
