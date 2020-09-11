package main.java.com.sergeykarpen.javacore.chapter11.thread.practic_thread.task2;

public class ThreadD implements Runnable {
    main.java.com.sergeykarpen.javacore.chapter11.thread.practic_thread.task2.fizzBuzz fizzBuzz;
    Thread t;

    public ThreadD(main.java.com.sergeykarpen.javacore.chapter11.thread.practic_thread.task2.fizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        fizzBuzz.number();
    }
}
