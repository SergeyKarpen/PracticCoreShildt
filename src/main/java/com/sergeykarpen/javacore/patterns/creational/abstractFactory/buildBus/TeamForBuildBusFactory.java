package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildBus;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.ConstructorTeamFactory;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Designer;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Mechanic;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Painter;

public class TeamForBuildBusFactory implements ConstructorTeamFactory {
    @Override
    public Designer getDesigner() {
        return new DesignerBus();
    }

    @Override
    public Mechanic getMechanic() {
        return new MechanicBus();
    }

    @Override
    public Painter getPainter() {
        return new PainterBus();
    }
}
