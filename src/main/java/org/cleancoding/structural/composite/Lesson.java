package org.cleancoding.structural.composite;

public class Lesson implements CourseComponent {

    private String name;

    public Lesson(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Lesson: " + name);
    }
}