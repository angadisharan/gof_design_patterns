package org.cleancoding.behavioural.command;

public class CommandDemo {

    public static void main(String[] args) {

        CourseService service = new CourseService();

        Command command =
                new PublishCourseCommand(service, "Design Patterns");

        CommandInvoker invoker = new CommandInvoker();

        invoker.run(command);
    }
}