package main.java.com.sergeykarpen.javacore.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryCar {
    private static final Map<String, Car> cars = new HashMap<>();

    public Car getCarBySpecialty(String speciality) {
        Car car = cars.get(speciality);

        if (car == null) {
            switch (speciality) {
                case "BMW":
                    System.out.println("Выгнали из гаража BMW");
                    car = new BMW();
                    break;
                case "Mercedes":
                    System.out.println("Выгнали из гаража Mercedes");
                    car = new Mercedes();
                    break;
            }
            cars.put(speciality, car);
        }
        return car;
    }
}
