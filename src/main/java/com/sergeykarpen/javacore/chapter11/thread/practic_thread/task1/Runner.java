package main.java.com.sergeykarpen.javacore.chapter11.thread.practic_thread.task1;

public class Runner {

    //Один и тот же экземпляр данного класса будет передан в 3 разных потока.
    // Поток А - будет вызывать метод first(). Поток B - second(). Поток С - third().
    //Необходимо реализовать механизм и изменить программу таким образом, что у всех потоков будут вызваны в правильном порядке.
    public static void main(String[] args) {
        Foo foo = new Foo();
        new Thread(new AThread(foo, "A"));
        new Thread(new BThread(foo, "B"));
        new Thread(new CThread(foo, "C"));
    }
}