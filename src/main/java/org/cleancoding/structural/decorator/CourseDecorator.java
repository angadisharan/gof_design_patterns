package org.cleancoding.structural.decorator;

public abstract class CourseDecorator implements Course {

    protected Course course;

    public CourseDecorator(Course course) {
        this.course = course;
    }
}