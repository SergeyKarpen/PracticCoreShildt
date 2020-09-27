package main.java.com.sergeykarpen.javacore.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class AutoRunner {
    public static void main(String[] args) {
        FactoryCar factoryCar = new FactoryCar();
        List<Car> cars = new ArrayList<>();

        cars.add(factoryCar.getCarBySpecialty("BMW"));
        cars.add(factoryCar.getCarBySpecialty("Mercedes"));
        cars.add(factoryCar.getCarBySpecialty("Mercedes"));
        cars.add(factoryCar.getCarBySpecialty("BMW"));

        for (Car car:  cars) {
            car.drive();
        }

    }
}
