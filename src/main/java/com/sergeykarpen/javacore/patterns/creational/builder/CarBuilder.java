package main.java.com.sergeykarpen.javacore.patterns.creational.builder;

public class CarBuilder {
    BrandCar brand = BrandCar.DEFAULT;
    TransmissionCar transmission = TransmissionCar.DEFAULT;
    BodyCar body = BodyCar.DEFAULT;
    ColourCar colour = ColourCar.DEFAULT;
    Long count = 0L;

    CarBuilder buildBrandCar(BrandCar brand) {
        this.brand = brand;
        return this;
    }

    CarBuilder buildTransmissionCar(TransmissionCar transmission) {
        this.transmission = transmission;
        return this;
    }

    CarBuilder buildBodyCar(BodyCar body) {
        this.body = body;
        return this;
    }

    CarBuilder buildColourCar(ColourCar colour) {
        this.colour = colour;
        return this;
    }

    CarBuilder buildCountCar (Long count) {
        this.count = count;
        return this;
    }
    Car build() {
        Car car = new Car();
        car.setBrand(brand);
        car.setTransmission(transmission);
        car.setBody(body);
        car.setColour(colour);
        car.setCount(count);
        return car;
    }
}
