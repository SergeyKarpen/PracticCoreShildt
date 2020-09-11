package main.java.com.sergeykarpen.javacore.chapter11.thread.practic_thread.task1;

public class AThread implements Runnable {
    Foo foo;
    String name;
    Thread t;


    AThread(Foo foo, String name) {
        this.foo = foo;
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        foo.first();
    }
}
