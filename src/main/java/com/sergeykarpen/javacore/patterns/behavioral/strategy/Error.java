package main.java.com.sergeykarpen.javacore.patterns.behavioral.strategy;

public class Error implements StateSystem {
    @Override
    public void state() {
        System.out.println("Система неисправна!");
    }
}
