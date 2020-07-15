package main.java.com.sergeykarpen.javacore.chapter28.concurrent;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

//Oбщий ресурс
class Shared1 {
    static int count = 0;
}

//Поток исполнения увиличивающий значение счетчика на еденицу
class IncThread implements Runnable {
    String name;
    Semaphore sem;

    IncThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }


    public void run() {
        System.out.println("Запуск потока " + name);
        try {
            //сначала получить разрешение
            System.out.println("Поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Поток " + name + " получает разрешение");
            //а теперь получить доступ к общему ресурсу

            for (int i = 0; i < 5; i++) {
                Shared1.count++;
                System.out.println(name + ": " + Shared1.count);

                //разрешить если возможно переключение контеста
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        //освободить разрешение
        System.out.println("Поток " + name + " особождает разрешение");
        sem.release();
    }
}

//поток исполнения уменьшаеющиый значение счетчяика на еденицу
class DecThread implements Runnable {
    String name;
    Semaphore sem;

    DecThread(Semaphore s, String n) {
        sem = s;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            //сначала получить разрешение
            System.out.println("Потока " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("Потока " + name + " получает разрешение");

            // a теперь получить доступ к общему ресурсу
            for (int i = 0; i < 5; i++) {
                Shared1.count--;
                System.out.println(name + ": " + Shared1.count);

                //разрешить если возиодно переключение контекста
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        //освабодить разрешение
        System.out.println("Поток " + name + " освабождает разрешение");
    }
}
