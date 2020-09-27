package main.java.com.sergeykarpen.javacore.patterns.behavioral.chain;

public class MessageForDirector extends LoggerForMessage {

    public MessageForDirector(int levelMessage) {
        super(levelMessage);
    }

    @Override
    public void writeMessage(String message, int level) {
        if (level <= levelMessage) {
            System.err.println("Сообщение для директора: " + message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }
}
