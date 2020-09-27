package main.java.com.sergeykarpen.javacore.patterns.behavioral.iterator;

public class IteratorApp {
    public static void main(String[] args) {

        Tasks collection = new Tasks();
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(iterator.first());
    }
}
