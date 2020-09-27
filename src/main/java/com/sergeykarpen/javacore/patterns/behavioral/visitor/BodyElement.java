package main.java.com.sergeykarpen.javacore.patterns.behavioral.visitor;

public class BodyElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
