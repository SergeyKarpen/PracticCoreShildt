package main.java.com.sergeykarpen.javacore.patterns.behavioral.state;

public class Port2 implements Connection {

    @Override
    public void contact() {
        System.out.println("Подключен порт№2");

    }
}
