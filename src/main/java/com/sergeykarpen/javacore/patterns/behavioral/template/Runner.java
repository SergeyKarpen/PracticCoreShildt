package main.java.com.sergeykarpen.javacore.patterns.behavioral.template;

public class Runner {
    public static void main(String[] args) {
        Class classA = new ClassA();
        Class classB = new ClassB();

        classA.templatePrint();
        classB.templatePrint();

    }
}
