package main.java.com.sergeykarpen.javacore.patterns.behavioral.template;

abstract class Class {
    void templatePrint() {
        System.out.println("Просто строка из класса");
        different();
        System.out.println("Просто строка из класса");
    }
    abstract void different();
}

