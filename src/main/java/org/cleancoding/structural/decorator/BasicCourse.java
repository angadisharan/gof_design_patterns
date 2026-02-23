package org.cleancoding.structural.decorator;

public class BasicCourse implements Course {

    public String getDescription() {
        return "Base Course";
    }

    public double getCost() {
        return 100;
    }
}