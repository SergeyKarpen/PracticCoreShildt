package main.java.com.sergeykarpen.javacore.patterns.behavioral.command;

public class CommandApp {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(new StartCommand(computer), new ResetCommand(computer), new StopCommand(computer));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();

    }
}
