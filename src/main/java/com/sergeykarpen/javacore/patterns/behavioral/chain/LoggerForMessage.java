package main.java.com.sergeykarpen.javacore.patterns.behavioral.chain;

public abstract class LoggerForMessage {
    int levelMessage;

    public LoggerForMessage(int levelMessage) {
        this.levelMessage = levelMessage;
    }

    LoggerForMessage next;
    public void setNext(LoggerForMessage next) {
        this.next = next;
    }

    abstract void writeMessage(String message, int level);
}
