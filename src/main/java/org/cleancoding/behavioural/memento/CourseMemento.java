package org.cleancoding.behavioural.memento;

public class CourseMemento {

    private final String content;

    public CourseMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}