package main.java.com.sergeykarpen.javacore.patterns.structural.composite;

public class CompositeCar {
    public static void main(String[] args) {
        TeamCar teamCar = new TeamCar();

        Driver driver = new Driver();
        Navigator navigator = new Navigator();
        Passenger passenger = new Passenger();

        teamCar.addTeamMember(driver);
        teamCar.addTeamMember(navigator);
        teamCar.addTeamMember(passenger);

        teamCar.createTeamCar();
    }
}
