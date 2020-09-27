package main.java.com.sergeykarpen.javacore.patterns.behavioral.state;

public class StateApp {
    public static void main(String[] args) {

        Connection connection = new Port1();
        DataBase dataBase = new DataBase();
        dataBase.setConnection(connection);

        for (int i = 0; i<10; i ++ ) {
            dataBase.contact();
            dataBase.nextConnection();
        }
    }
}
