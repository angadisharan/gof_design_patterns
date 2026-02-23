package org.cleancoding.creation.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();

        obj1.sayHello();

        // prove only one instance exists
        System.out.println(obj1 == obj2);
    }
}