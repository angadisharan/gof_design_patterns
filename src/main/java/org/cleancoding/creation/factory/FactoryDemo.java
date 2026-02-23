package org.cleancoding.creation.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        Shape shape = ShapeFactory.createShape("circle");

        shape.draw();
    }
}