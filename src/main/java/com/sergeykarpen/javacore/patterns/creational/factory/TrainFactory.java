package main.java.com.sergeykarpen.javacore.patterns.creational.factory;

public class TrainFactory implements  TransportFactory{
    @Override
    public Transport createTransport() {
        return new Train();
    }
}
