package main.java.com.sergeykarpen.javacore.patterns.structural.facade;

import org.w3c.dom.ls.LSOutput;

public class DVDRom {
    private boolean data = false;

    public boolean hasData() {
        return data;
    }

    void load() {
        System.out.println("Диск вставлен!");
        data = true;
    }

    void unLoad() {
        System.out.println("Диск отсутствует!");
        data = false;
    }
}
