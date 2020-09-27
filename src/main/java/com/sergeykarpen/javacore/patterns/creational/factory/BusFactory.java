package main.java.com.sergeykarpen.javacore.patterns.creational.factory;

public class BusFactory implements TransportFactory {
    @Override
    public Bus createTransport() {
        return new Bus();
    }
}
