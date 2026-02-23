package org.cleancoding.creation.singleton;

public class SingletonExample {

    private static SingletonExample instance;

    // private constructor
    private SingletonExample() {}

    public static SingletonExample getInstance() {

        if (instance == null) {
            instance = new SingletonExample();
        }

        return instance;
    }

    public void sayHello() {
        System.out.println("Hello from Singleton");
    }
}