package main.java.com.sergeykarpen.javacore.chapter11.thread.practic_thread.task1;

import main.java.com.sergeykarpen.javacore.chapter11.thread.theory_thread.Foo;

import java.util.concurrent.locks.ReentrantLock;

public class BThread implements Runnable {
    Foo foo;
    String name;
    Thread t;

    BThread(Foo foo, String name) {
        this.foo = foo;
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }


    @Override
    public void run() {
        foo.second();
    }
}
