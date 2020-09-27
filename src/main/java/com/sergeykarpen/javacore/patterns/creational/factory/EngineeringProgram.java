package main.java.com.sergeykarpen.javacore.patterns.creational.factory;

public class EngineeringProgram {
    public static void main(String[] args) {
        TransportFactory transportFactory = transportOrders("tfgh");
        Transport transport = transportFactory.createTransport();
        transport.drive();
    }

    static TransportFactory transportOrders (String nameTransport) {
        if (nameTransport.equalsIgnoreCase("Bus")) {
            return new BusFactory();
        } else if (nameTransport.equalsIgnoreCase("Ship")) {
            return new ShipFactory();
        } else if (nameTransport.equalsIgnoreCase("Train")) {
                return new TrainFactory();
        } else throw new RuntimeException(nameTransport + " - " + "There is no such transport");
    }
}
