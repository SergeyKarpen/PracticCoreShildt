package main.java.com.sergeykarpen.javacore.patterns.behavioral.observer;

public class FirstStage implements Observer{

    @Override
    public void handleEvent(int temperatureWall, int temperatureRoof, int temperatureFloor) {
        System.out.println("Температура:\n" + "на стенах: " + temperatureWall +"\n"+ "на потолке: " + temperatureRoof + "\n" + "на полу: " + temperatureFloor);
    }
}
