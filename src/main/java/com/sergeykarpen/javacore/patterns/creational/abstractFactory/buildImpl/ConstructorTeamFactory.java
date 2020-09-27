package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl;

public interface ConstructorTeamFactory {
    Designer getDesigner();
    Mechanic getMechanic();
    Painter getPainter();
}
