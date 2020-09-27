package main.java.com.sergeykarpen.javacore.patterns.behavioral.observer;

public interface Observer {
    void handleEvent(int temperatureWall, int temperatureRoof, int temperatureFloor);
}
