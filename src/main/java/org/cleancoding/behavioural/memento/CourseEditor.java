package org.cleancoding.behavioural.memento;

public class CourseEditor {

    private String content;

    public void setContent(String content) {
        this.content = content;
        System.out.println("Content set: " + content);
    }

    public CourseMemento save() {
        return new CourseMemento(content);
    }

    public void restore(CourseMemento memento) {
        content = memento.getContent();
        System.out.println("Restored content: " + content);
    }
}