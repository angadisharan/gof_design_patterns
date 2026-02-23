package org.cleancoding.creation.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

        Course original = new Course("Design Patterns", "Advanced");

        Course copy = original.clone();

        copy.setTitle("Design Patterns - Copy");

        original.print();
        copy.print();
    }
}