package org.cleancoding.structural.proxy;

public class RealCourseService implements CourseService {

    public RealCourseService() {
        System.out.println("Loading real course service...");
    }

    @Override
    public void accessCourse(String courseName) {
        System.out.println("Accessing course: " + courseName);
    }
}