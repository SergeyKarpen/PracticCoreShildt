package main.java.com.sergeykarpen.javacore.chapter11.Thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {

    Thread thread = Thread.currentThread();

    System.out.println("Текущий поток исполнения " + thread);

    //изменить имя потока исполнения
        thread.setName("My Thread");
        System.out.println("после изменения имени потока " + thread);

        for (int i = 5; i > 0; i --) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
}