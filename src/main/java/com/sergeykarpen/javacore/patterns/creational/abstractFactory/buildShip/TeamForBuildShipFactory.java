package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildShip;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.ConstructorTeamFactory;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Designer;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Mechanic;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Painter;

public class TeamForBuildShipFactory implements ConstructorTeamFactory {
    @Override
    public Designer getDesigner() {
        return new DesignerShip();
    }

    @Override
    public Mechanic getMechanic() {
        return new MechanicShip();
    }

    @Override
    public Painter getPainter() {
        return new PainterShip();
    }
}
