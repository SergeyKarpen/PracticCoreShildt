package main.java.com.sergeykarpen.javacore.patterns.behavioral.state;

public class DataBase {
    Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void nextConnection() {
        if (connection instanceof Port1) {
            setConnection(new Port2());
        } else if (connection instanceof Port2) {
            setConnection(new Port3());
        } else if (connection instanceof Port3) {
            setConnection(new Port1());
        }
    }
    public void contact() {
        connection.contact();
    }
}
