package main.java.com.sergeykarpen.javacore.patterns.structural.bridge;

public class IOS extends OS {
    public IOS(Device device) {
        super(device);
    }
    void showWork() {
        System.out.println("На данном устройстве установлена система IOS");
        device.setDevice();
    }
}
