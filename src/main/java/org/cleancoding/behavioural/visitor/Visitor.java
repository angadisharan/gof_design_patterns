package org.cleancoding.behavioural.visitor;

public interface Visitor {

    void visit(Lesson lesson);

    void visit(Quiz quiz);
}