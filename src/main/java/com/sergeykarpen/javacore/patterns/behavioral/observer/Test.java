package main.java.com.sergeykarpen.javacore.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Test implements Observed {

    int temperatureWall;
    int temperatureRoof;
    int temperatureFloor;
    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int f, int r, int w) {
        temperatureRoof = r;
        temperatureFloor = f;
        temperatureWall = w;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(temperatureWall, temperatureFloor, temperatureRoof);
        }
    }
}
