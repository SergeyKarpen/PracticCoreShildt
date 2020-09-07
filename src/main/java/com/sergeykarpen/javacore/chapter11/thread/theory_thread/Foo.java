package main.java.com.sergeykarpen.javacore.chapter11.thread.theory_thread;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {
    ReentrantLock locker;
    Condition condition;
    AtomicBoolean aBoolean = new AtomicBoolean(false);
    AtomicBoolean bBoolean = new AtomicBoolean(false);

    public Foo() {
        locker = new ReentrantLock(); // создаем блокировку
        condition = locker.newCondition(); // делаем условие, связанное с блокировкой
    }

    public void first() {
        locker.lock();
        aBoolean.set(true);
        locker.unlock();
        System.out.print("first");
    }

    public void second() {
        locker.lock();
        try {
            while (!aBoolean.get())
                condition.await();
            condition.signalAll();
            System.out.print("second");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bBoolean.set(true);
            locker.unlock();
        }
    }

    public void third() {
        locker.lock();
        try {
            while (!bBoolean.get())
                condition.await();
            System.out.print("third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }
}
