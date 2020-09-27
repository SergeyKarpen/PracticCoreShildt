package main.java.com.sergeykarpen.javacore.patterns.creational.singleton;

public class Runner {
    public static void main(String[] args) {

        Database.getInfoFromBD().showInfoInBD();

        Database.getInfoFromBD().addInfoInBD("New information add in BD");

        Database.getInfoFromBD().showInfoInBD();

    }
}
