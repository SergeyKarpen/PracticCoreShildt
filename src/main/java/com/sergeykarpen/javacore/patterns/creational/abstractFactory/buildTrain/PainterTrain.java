package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildTrain;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Painter;

public class PainterTrain implements Painter {
    @Override
    public void paints() {
        System.out.println("Paint the train");
    }
}
