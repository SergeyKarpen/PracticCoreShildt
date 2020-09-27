package main.java.com.sergeykarpen.javacore.patterns.structural.proxy;

public class ProxyFile implements LoadFile {
    String pathFile;
    RealLoadFileImpl realLoadFile;

    public ProxyFile(String pathFile) {
        this.pathFile = pathFile;
    }

    @Override
    public void showOnScreen() {
        if (realLoadFile == null) {
            realLoadFile = new RealLoadFileImpl(pathFile);
        }
        realLoadFile.showOnScreen();
    }
}