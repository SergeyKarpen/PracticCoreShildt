package main.java.com.sergeykarpen.javacore.patterns.behavioral.state;

 class Port1 implements Connection{

    @Override
    public void contact() {
        System.out.println("Подключен порт№1");
    }
}
