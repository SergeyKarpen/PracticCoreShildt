package main.java.com.sergeykarpen.javacore.patterns.behavioral.state;

public class Port3 implements Connection {
    @Override
    public void contact() {
        System.out.println("подключен порт№3");
    }
}
