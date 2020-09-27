package main.java.com.sergeykarpen.javacore.patterns.creational.factory;

public class ShipFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
