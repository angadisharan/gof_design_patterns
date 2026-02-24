package org.cleancoding.structural.bridge;

public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    public void power() {
        device.turnOn();
    }
}