package main.java.com.sergeykarpen.javacore.patterns.behavioral.strategy;

public class ProcessSystem {
    StateSystem stateSystem;

    public void setStateSystem(StateSystem stateSystem) {
        this.stateSystem = stateSystem;
    }

    public void executeState(){
        stateSystem.state();
    }
}
