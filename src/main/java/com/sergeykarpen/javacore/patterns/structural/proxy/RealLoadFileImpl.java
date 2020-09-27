package main.java.com.sergeykarpen.javacore.patterns.structural.proxy;

public class RealLoadFileImpl implements LoadFile {
    String pathFile;

    public RealLoadFileImpl(String pathFile) {
        this.pathFile = pathFile;
        load();
    }

    void load() {
        System.out.println("Загружаем фаил из " + pathFile);
    }

    @Override
    public void showOnScreen() {
        System.out.println("Показываем на экране файл из: " + pathFile);
    }
}
