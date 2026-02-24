package org.cleancoding.behavioural.visitor;

public class Quiz implements CourseElement {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}