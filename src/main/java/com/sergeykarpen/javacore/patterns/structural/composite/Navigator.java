package main.java.com.sergeykarpen.javacore.patterns.structural.composite;


public class Navigator implements TeamMember {

    @Override
    public void positionCar() {
        System.out.println("Штурман - указывает дорогу для водителя...");
    }
}
