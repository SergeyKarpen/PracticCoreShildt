package main.java.com.sergeykarpen.javacore.chapter28.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}

class Shared {
    static AtomicInteger ai = new AtomicInteger(0);
}

//Поток исполгненитя в котором инкрементиркутеся значение счетчика
class AtomThread implements Runnable {
    String name;

    AtomThread(String n) {
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока" + name);
        for (int i = 0; i <= 3; i++)
            System.out.println("Поток " + name + " получено: " + Shared.ai.getAndSet(i));
        }
    }

