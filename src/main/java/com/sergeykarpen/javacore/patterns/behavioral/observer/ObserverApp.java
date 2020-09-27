package main.java.com.sergeykarpen.javacore.patterns.behavioral.observer;

public class ObserverApp {
    public static void main(String[] args) {
        Test test = new Test();
        test.addObserver(new FirstStage());
        test.setMeasurements(175, 50, 180);
    }
}
