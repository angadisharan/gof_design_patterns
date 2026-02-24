package org.cleancoding.behavioural.visitor;

public class Lesson implements CourseElement {

    private String name;

    public Lesson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}