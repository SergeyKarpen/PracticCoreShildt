package main.java.com.sergeykarpen.javacore.patterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
