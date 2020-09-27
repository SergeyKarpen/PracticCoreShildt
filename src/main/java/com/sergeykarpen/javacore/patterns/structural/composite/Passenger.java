package main.java.com.sergeykarpen.javacore.patterns.structural.composite;

public class Passenger implements TeamMember{
    @Override
    public void positionCar() {
        System.out.println("Пассажир просто едет на заднем сиденьи в машине...");
    }
}
