package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.ConstructorTeamFactory;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Designer;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Mechanic;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Painter;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildShip.TeamForBuildShipFactory;

public class ShipOrder {
    public static void main(String[] args) {
        ConstructorTeamFactory constructorTeamFactory = new TeamForBuildShipFactory();
        Designer designer = constructorTeamFactory.getDesigner();
        Mechanic mechanic = constructorTeamFactory.getMechanic();
        Painter painter = constructorTeamFactory.getPainter();

        System.out.println("New ship is under construction...");
        designer.makesProject();
        mechanic.collect();
        painter.paints();
    }
}

