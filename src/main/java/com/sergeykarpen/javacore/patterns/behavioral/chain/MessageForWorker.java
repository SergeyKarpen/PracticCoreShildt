package main.java.com.sergeykarpen.javacore.patterns.behavioral.chain;

public class MessageForWorker extends LoggerForMessage {

    public MessageForWorker(int levelMessage) {
        super(levelMessage);
    }

    @Override
    public void writeMessage(String message, int level) {
        if (level <= levelMessage) {
            System.out.println("Сообщение всем работникам: " + message);
        }
        if (next != null) {
            next.writeMessage(message, level);
        }
    }
}