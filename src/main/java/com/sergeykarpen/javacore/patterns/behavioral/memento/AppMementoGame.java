package main.java.com.sergeykarpen.javacore.patterns.behavioral.memento;

public class AppMementoGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("1", 150000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("2", 20000);
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);

    }
}
