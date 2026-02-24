package org.cleancoding.structural.bridge;

public class TV implements Device {

    public void turnOn() {
        System.out.println("TV turned ON");
    }

    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}