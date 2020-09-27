package main.java.com.sergeykarpen.javacore.patterns.structural.facade;

public class HDD {
    void copyDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("Идет запись/копирование данных с диска");
        } else System.out.println("Необходимо вставить диск");

    }
}
