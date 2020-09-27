package main.java.com.sergeykarpen.javacore.patterns.behavioral.strategy;

public class Update implements StateSystem {
    @Override
    public void state() {
        System.out.println("Система обновляется");
    }
}
