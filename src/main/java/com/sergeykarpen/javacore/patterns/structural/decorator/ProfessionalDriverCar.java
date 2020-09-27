package main.java.com.sergeykarpen.javacore.patterns.structural.decorator;

public class ProfessionalDriverCar  extends DriverDecorator{

    public ProfessionalDriverCar(DriverCar driverCar) {
        super(driverCar);
    }

    public String upDrivingLevel(){
        return ", и может говорить по телефону...";
    }

    @Override
    public String drive() {
        return super.drive() + upDrivingLevel();
    }
}
