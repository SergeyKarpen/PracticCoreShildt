package main.java.com.sergeykarpen.javacore.patterns.creational.prototype;

public class OriginalCar implements CloneCar {
    private int number;
    private String brand;
    private String colour;

    public OriginalCar(int number, String brand, String colour) {
        this.number = number;
        this.brand = brand;
        this.colour = colour;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public Object copy() {
        OriginalCar originalCar = new OriginalCar(number, brand, colour);
        return originalCar;
    }

    @Override
    public String toString() {
        return "OriginalCar{" +
                "number=" + number +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
