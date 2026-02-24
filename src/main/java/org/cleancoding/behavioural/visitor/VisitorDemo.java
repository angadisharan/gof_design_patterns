package org.cleancoding.behavioural.visitor;

public class VisitorDemo {

    public static void main(String[] args) {

        CourseElement lesson = new Lesson("Design Patterns");
        CourseElement quiz = new Quiz();

        Visitor visitor = new ReportVisitor();

        lesson.accept(visitor);
        quiz.accept(visitor);
    }
}