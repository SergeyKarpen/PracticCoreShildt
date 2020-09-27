package main.java.com.sergeykarpen.javacore.patterns.creational.prototype;

public class FactoryCar {
    OriginalCar originalCar;

    public FactoryCar(OriginalCar originalCar) {
        this.originalCar = originalCar;
    }

    public void setOriginalCar(OriginalCar originalCar) {
        this.originalCar = originalCar;
    }

    OriginalCar cloneCar() {
         return (OriginalCar) originalCar.copy();
    }
}
