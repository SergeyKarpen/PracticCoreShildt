package main.java.com.sergeykarpen.javacore.patterns.structural.adapter;

public class RemoteControl {
    public void buttonTurnOn() {
        System.out.println("Телдевизор включился через кнопку на пульте");
    }

    public void buttonTurnOff() {
        System.out.println("Телевизор выключился через кнопку на пульте");
    }

    public void buttonToSwitch() {
        System.out.println("На телевизоре переключаются каналы через пульт... ");
    }
}
