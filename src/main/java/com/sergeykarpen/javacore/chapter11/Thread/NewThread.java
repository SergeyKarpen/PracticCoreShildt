package main.java.com.sergeykarpen.javacore.chapter11.Thread;

import org.w3c.dom.ls.LSOutput;

class NewThread1 implements Runnable {
    Thread t;

    NewThread1() {
        //создать новый, второй поток исполнения
        t = new Thread(this, "демонстрационный поток");
        System.out.println("Дочерный поток создан: " + t);
        t.start();
        //запустить поток исполнения
    }

    //Точка входа во второй поток исполнения
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }
        System.out.println("Дочерный поток завершен.");
    }
}

class ThreadDemo {
    public static void main(String args[]) {
        new NewThread1(); // создать новый поток

        try {
            for (int i = 5; i > 0; i--) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e ) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен");
    }
}
