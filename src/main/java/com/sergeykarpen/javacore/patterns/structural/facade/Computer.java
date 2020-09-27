package main.java.com.sergeykarpen.javacore.patterns.structural.facade;

public class Computer {
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.powerOn();
        dvd.load();
        hdd.copyDVD(dvd);
    }
}
