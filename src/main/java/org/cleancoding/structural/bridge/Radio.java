package org.cleancoding.structural.bridge;

public class Radio implements Device {

    public void turnOn() {
        System.out.println("Radio turned ON");
    }

    public void turnOff() {
        System.out.println("Radio turned OFF");
    }
}