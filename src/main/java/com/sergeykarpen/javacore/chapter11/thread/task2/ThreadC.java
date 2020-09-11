package main.java.com.sergeykarpen.javacore.chapter11.thread.task2;

public class ThreadC implements Runnable {
    main.java.com.sergeykarpen.javacore.chapter11.thread.task2.fizzBuzz fizzBuzz;
    Thread t;

    public ThreadC(main.java.com.sergeykarpen.javacore.chapter11.thread.task2.fizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        fizzBuzz.fizzbuzz();
    }
}

