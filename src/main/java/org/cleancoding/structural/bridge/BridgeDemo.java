package org.cleancoding.structural.bridge;

public class BridgeDemo {

    public static void main(String[] args) {

        Device tv = new TV();
        RemoteControl remote = new BasicRemote(tv);

        remote.power();
    }
}