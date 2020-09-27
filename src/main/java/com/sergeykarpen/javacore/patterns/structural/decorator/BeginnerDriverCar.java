package main.java.com.sergeykarpen.javacore.patterns.structural.decorator;

public class BeginnerDriverCar implements DriverCar {
    @Override
    public String drive() {
      return "Едет за рулем автомобиля";
    }
}
