package main.java.com.sergeykarpen.javacore.patterns.behavioral.chain;

public class ChainApp {
    public static void main(String[] args) {
        LoggerForMessage loggerLevel0 = new MessageForDirector(LevelInformation.ERROR);
        LoggerForMessage loggerLevel1 = new MessageForWorker(LevelInformation.ATTENTION);
        LoggerForMessage loggerLevel2 = new MessageForClients(LevelInformation.INFO);

        loggerLevel0.setNext(loggerLevel1);
        loggerLevel1.setNext(loggerLevel2);

        loggerLevel0.writeMessage("Напоминание об обновлении" , LevelInformation.INFO);
        loggerLevel0.writeMessage("Система просит обновить систему!", LevelInformation.ATTENTION);
        loggerLevel0.writeMessage("Система перестала работать т.к не установлено обновление!", LevelInformation.ERROR);

    }
}
