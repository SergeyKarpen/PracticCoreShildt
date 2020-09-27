package main.java.com.sergeykarpen.javacore.patterns.structural.bridge;

public class Android extends OS {
    public Android(Device device) {
        super(device);
    }

    void showWork() {
        System.out.println("На данном устройстве установлена система Android");
        device.setDevice();
    }
}
