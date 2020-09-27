package main.java.com.sergeykarpen.javacore.patterns.creational.prototype;

public class OrderCar {
    public static void main(String[] args) {
        OriginalCar car = new OriginalCar(5465,"BMW","Red");

        System.out.println(car);

        FactoryCar factoryCar = new FactoryCar(car);

        OriginalCar cloneCar = factoryCar.cloneCar();

        System.out.println(cloneCar);
    }
}
