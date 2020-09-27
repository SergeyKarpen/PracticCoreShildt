package main.java.com.sergeykarpen.javacore.patterns.creational.builder;

public class RunCarSelection {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildBrandCar(BrandCar.BMW)
                .buildBodyCar(BodyCar.WAGON)
                .buildTransmissionCar(TransmissionCar.AUTO)
                .buildColourCar(ColourCar.BLACK)
                .buildCountCar(70000L)
                .build();
        System.out.println(car);
    }
}
