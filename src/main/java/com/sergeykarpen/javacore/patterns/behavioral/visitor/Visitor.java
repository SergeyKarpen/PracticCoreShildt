package main.java.com.sergeykarpen.javacore.patterns.behavioral.visitor;

public interface Visitor {
    public void visit (EngineElement engineElement);
    public void visit (BodyElement bodyElement);
}
