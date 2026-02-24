package org.cleancoding.behavioural.visitor;

public interface CourseElement {

    void accept(Visitor visitor);
}