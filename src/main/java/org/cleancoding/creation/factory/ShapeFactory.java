package org.cleancoding.creation.factory;

public class ShapeFactory {

    public static Shape createShape(String type) {

        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        }

        if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        }

        throw new IllegalArgumentException("Unknown shape");
    }
}