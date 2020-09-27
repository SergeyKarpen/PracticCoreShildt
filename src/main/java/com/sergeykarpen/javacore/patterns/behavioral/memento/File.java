package main.java.com.sergeykarpen.javacore.patterns.behavioral.memento;

public class File {
    Save save;

    public void setSave(Save save) {
        this.save = save;
    }

    public Save getSave() {
        return save;
    }
}
