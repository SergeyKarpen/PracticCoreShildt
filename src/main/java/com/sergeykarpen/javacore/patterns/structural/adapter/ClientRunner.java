package main.java.com.sergeykarpen.javacore.patterns.structural.adapter;

public class ClientRunner {
    public static void main(String[] args) {
        TV client = new AdapterRemoteControlToTV();
        client.turnOn();
        client.toSwitch();
        client.turnOff();

    }
}
