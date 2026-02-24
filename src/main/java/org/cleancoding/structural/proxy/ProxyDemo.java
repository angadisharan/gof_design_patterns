package org.cleancoding.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {

        CourseService service = new CourseServiceProxy();

        service.accessCourse("Design Patterns");

        service.accessCourse("System Design");
    }
}