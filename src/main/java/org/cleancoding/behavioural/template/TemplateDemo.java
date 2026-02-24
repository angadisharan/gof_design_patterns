package org.cleancoding.behavioural.template;

public class TemplateDemo {

    public static void main(String[] args) {

        CoursePublisher publisher = new VideoCoursePublisher();
        publisher.publish();

        System.out.println("-----");

        publisher = new ArticleCoursePublisher();
        publisher.publish();
    }
}