package main.java.com.sergeykarpen.javacore.chapter11.thread.theory_thread;

//Применить метод join(), чтобы ожидапть завершение птоков исполнения
class NewThread implements Runnable {
    String name; // имя потока исполнения
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();//запустить поток исполнения
    }

    //Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + "завершен.");
    }
}

class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        NewThread ob3 = new NewThread("Три");

        System.out.println("Поток один запущен: " + ob1.t.isAlive());
        System.out.println("Поток два запущен: " + ob2.t.isAlive());
        System.out.println("Поток три запущен: " + ob3.t.isAlive());

        //ожидать завершение потока
        try {
            System.out.println("Ожидание завершение потоков");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главвный пток прерван");
        }

        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());

        System.out.println("Главнй поток завершен.");

    }
}
