package main.java.com.sergeykarpen.javacore.patterns.behavioral.strategy;

public class ToDoNothing implements StateSystem {
    @Override
    public void state() {
        System.out.println("Система не работает");
    }
}
