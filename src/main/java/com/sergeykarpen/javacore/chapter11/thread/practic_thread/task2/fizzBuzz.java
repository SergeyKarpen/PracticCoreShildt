package main.java.com.sergeykarpen.javacore.chapter11.thread.practic_thread.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class fizzBuzz {
    static SynchronousQueue<Integer> queue = new SynchronousQueue<>();
    static SynchronousQueue<Integer> queue2 = new SynchronousQueue<>();
    static SynchronousQueue<Integer> queue3 = new SynchronousQueue<>();
    volatile static int i = 15;
    volatile public static int a;

    public static ArrayList<Integer> array(Integer i) {
        ArrayList<Integer> list = new ArrayList<>();
        for (a = 1; a <= i; a++) {
            list.add(a);
        }
        return list;
    }

    public fizzBuzz(int a) {
        this.a = a;
    }

    public List<Integer> cyclicNumber() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            list.add(i);
        }
        return list;
    }

    public void fizz() {
        for (int d : array(i))
            try {
                if (d % 3 == 0 && d % 5 != 0) {
                    System.out.print("fizz, ");
                }
                queue.put(d);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }


    public void buzz() {
        for (int d : array(i)) {
            try {
                if (d % 5 == 0 && d % 3 != 0) {
                    System.out.print("buzz, ");
                }
                d = queue.take();
                queue2.put(d);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void fizzbuzz() {

        for (int d : array(i)) {
            try {
                if (d % 3 == 0 && d % 5 == 0) {
                    System.out.print("fizzbuzz, ");
                }
                d = queue2.take();
                queue3.put(d);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void number() {
        for (int d : array(i)) {
            try {
                if (d % 3 != 0 && d % 5 != 0) {
                    System.out.print(d + ", ");
                }
                d = queue3.take();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}