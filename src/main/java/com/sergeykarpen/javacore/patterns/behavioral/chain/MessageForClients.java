package main.java.com.sergeykarpen.javacore.patterns.behavioral.chain;

public class MessageForClients extends LoggerForMessage {

    public MessageForClients(int levelMessage) {
        super(levelMessage);
    }

    @Override
    public void writeMessage(String message, int level) {
        if (level <= levelMessage) {
            System.out.println("Сообщение для клиентов: " + message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }
}