package org.cleancoding.behavioural.command;

public class PublishCourseCommand implements Command {

    private CourseService service;
    private String courseName;

    public PublishCourseCommand(CourseService service, String courseName) {
        this.service = service;
        this.courseName = courseName;
    }

    public void execute() {
        service.publishCourse(courseName);
    }
}