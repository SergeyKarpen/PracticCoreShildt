package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildShip;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Painter;

public class PainterShip implements Painter {
    @Override
    public void paints() {
        System.out.println("Paint the ship");
    }
}
