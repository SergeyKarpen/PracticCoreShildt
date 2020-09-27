package main.java.com.sergeykarpen.javacore.patterns.creational.builder;

public class Car {
    BrandCar brand;
    TransmissionCar transmission;
    BodyCar body;
    ColourCar colour;
    Long count;

    public void setBrand(BrandCar brand) {
        this.brand = brand;
    }

    public void setTransmission(TransmissionCar transmission) {
        this.transmission = transmission;
    }

    public void setBody(BodyCar body) {
        this.body = body;
    }

    public void setColour(ColourCar colour) {
        this.colour = colour;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", transmission=" + transmission +
                ", body=" + body +
                ", colour=" + colour +
                ", count=" + count +
                '}';
    }
}
