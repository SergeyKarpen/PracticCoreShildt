package main.java.com.sergeykarpen.javacore.patterns.structural.decorator;

public class DriverDecorator  implements DriverCar{
    DriverCar driverCar;

    public DriverDecorator(DriverCar driverCar) {
        this.driverCar = driverCar;
    }

    @Override
    public String drive() {
        return driverCar.drive();
    }
}
