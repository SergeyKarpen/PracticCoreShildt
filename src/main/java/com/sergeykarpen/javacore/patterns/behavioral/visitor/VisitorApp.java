package main.java.com.sergeykarpen.javacore.patterns.behavioral.visitor;

import javax.imageio.stream.ImageInputStream;

public class VisitorApp {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor crashVisitor = new CrashVisitor();
        Visitor mechanicVisitor = new MechanicVisitor();

        body.accept(crashVisitor);
        engine.accept(crashVisitor);

        body.accept(mechanicVisitor);
        engine.accept(mechanicVisitor);
    }
}
