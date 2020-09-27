package main.java.com.sergeykarpen.javacore.patterns.behavioral.visitor;

public class EngineElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
