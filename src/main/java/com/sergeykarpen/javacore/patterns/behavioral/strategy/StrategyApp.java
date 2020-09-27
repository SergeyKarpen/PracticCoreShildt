package main.java.com.sergeykarpen.javacore.patterns.behavioral.strategy;

public class StrategyApp {
    public static void main(String[] args) {
        ProcessSystem processSystem = new ProcessSystem();
        processSystem.setStateSystem(new Update());
        processSystem.executeState();

        processSystem.setStateSystem(new Working());
        processSystem.executeState();

        processSystem.setStateSystem(new ToDoNothing());
        processSystem.executeState();

        processSystem.setStateSystem(new Error());
        processSystem.executeState();

    }
}
