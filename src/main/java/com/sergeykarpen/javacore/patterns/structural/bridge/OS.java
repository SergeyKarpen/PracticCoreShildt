package main.java.com.sergeykarpen.javacore.patterns.structural.bridge;

abstract class OS {
    Device device;
    public OS(Device device){this.device = device;}
    abstract void showWork();
}
