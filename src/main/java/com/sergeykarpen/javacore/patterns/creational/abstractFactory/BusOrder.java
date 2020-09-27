package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildBus.TeamForBuildBusFactory;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.ConstructorTeamFactory;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Designer;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Mechanic;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Painter;

public class BusOrder {
    public static void main(String[] args) {
        ConstructorTeamFactory constructorTeamFactory = new TeamForBuildBusFactory();
        Designer designer = constructorTeamFactory.getDesigner();
        Mechanic mechanic = constructorTeamFactory.getMechanic();
        Painter painter = constructorTeamFactory.getPainter();

        System.out.println("New bus is under construction...");
        designer.makesProject();;
        mechanic.collect();
        painter.paints();
    }
}
