package main.java.com.sergeykarpen.javacore.patterns.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        DriverCar driverCar = new ProfessionalDriverCar(new BeginnerDriverCar());

        System.out.println(driverCar.drive());

    }
}