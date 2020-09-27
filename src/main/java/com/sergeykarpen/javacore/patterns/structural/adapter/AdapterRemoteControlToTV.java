package main.java.com.sergeykarpen.javacore.patterns.structural.adapter;

public class AdapterRemoteControlToTV extends RemoteControl implements TV {
    @Override
    public void turnOn() {
       buttonTurnOn();
    }

    @Override
    public void turnOff() {
        buttonTurnOff();
    }

    @Override
    public void toSwitch() {
        buttonToSwitch();
    }
}
