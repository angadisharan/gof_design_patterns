package org.cleancoding.creation.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        Course course = new Course.Builder()
                .setTitle("Builder Design Pattern")
                .setLevel("Intermediate")
                .setDuration(2)
                .build();

        course.print();
    }
}