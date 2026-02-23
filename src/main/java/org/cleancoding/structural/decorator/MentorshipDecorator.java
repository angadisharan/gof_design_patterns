package org.cleancoding.structural.decorator;

public class MentorshipDecorator extends CourseDecorator {

    public MentorshipDecorator(Course course) {
        super(course);
    }

    public String getDescription() {
        return course.getDescription() + " + Mentorship";
    }

    public double getCost() {
        return course.getCost() + 30;
    }
}