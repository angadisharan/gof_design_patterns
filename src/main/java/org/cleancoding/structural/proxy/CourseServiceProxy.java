package org.cleancoding.structural.proxy;

public class CourseServiceProxy implements CourseService {

    private RealCourseService realService;

    @Override
    public void accessCourse(String courseName) {

        if(realService == null) {
            realService = new RealCourseService();
        }

        System.out.println("Proxy check before accessing course");

        realService.accessCourse(courseName);
    }
}