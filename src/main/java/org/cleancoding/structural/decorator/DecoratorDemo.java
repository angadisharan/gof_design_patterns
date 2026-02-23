package org.cleancoding.structural.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {

        Course course = new BasicCourse();

        course = new CertificationDecorator(course);
        course = new MentorshipDecorator(course);

        System.out.println(course.getDescription());
        System.out.println(course.getCost());
    }
}