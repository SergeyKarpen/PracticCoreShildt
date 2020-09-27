package main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildTrain;

import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.ConstructorTeamFactory;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Designer;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Mechanic;
import main.java.com.sergeykarpen.javacore.patterns.creational.abstractFactory.buildImpl.Painter;

public class TeamForBuildTrainFactory implements ConstructorTeamFactory {
    @Override
    public Designer getDesigner() {
        return new DesignerTrain();
    }

    @Override
    public Mechanic getMechanic() {
        return new MechanicTrain();
    }

    @Override
    public Painter getPainter() {
        return new PainterTrain();
    }
}
