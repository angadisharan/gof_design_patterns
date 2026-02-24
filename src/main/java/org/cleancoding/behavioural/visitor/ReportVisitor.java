package org.cleancoding.behavioural.visitor;

public class ReportVisitor implements Visitor {

    public void visit(Lesson lesson) {
        System.out.println("Generating report for lesson: " + lesson.getName());
    }

    public void visit(Quiz quiz) {
        System.out.println("Generating report for quiz");
    }
}