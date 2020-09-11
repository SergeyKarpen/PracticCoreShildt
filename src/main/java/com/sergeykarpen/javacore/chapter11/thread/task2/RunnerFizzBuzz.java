package main.java.com.sergeykarpen.javacore.chapter11.thread.task2;

public class RunnerFizzBuzz {
    public static void main(String[] args) {
        fizzBuzz fizzBuzz = new fizzBuzz(15);
        new Thread(new ThreadA(fizzBuzz));
        new Thread(new ThreadB(fizzBuzz));
        new Thread(new ThreadC(fizzBuzz));
        new Thread(new ThreadD(fizzBuzz));

    }
}
