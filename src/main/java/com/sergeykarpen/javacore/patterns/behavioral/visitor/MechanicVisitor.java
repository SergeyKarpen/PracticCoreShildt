package main.java.com.sergeykarpen.javacore.patterns.behavioral.visitor;

import org.w3c.dom.ls.LSOutput;

public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engineElement) {
        System.out.println("Чинит двигатель");
    }

    @Override
    public void visit(BodyElement bodyElement) {
        System.out.println("Выравнивает крышу");
    }
}
