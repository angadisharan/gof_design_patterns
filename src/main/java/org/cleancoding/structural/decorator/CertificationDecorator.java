package org.cleancoding.structural.decorator;

public class CertificationDecorator extends CourseDecorator {

    public CertificationDecorator(Course course) {
        super(course);
    }

    public String getDescription() {
        return course.getDescription() + " + Certification";
    }

    public double getCost() {
        return course.getCost() + 50;
    }
}