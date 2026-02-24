package org.cleancoding.behavioural.memento;

import java.util.Stack;

public class History {

    private Stack<CourseMemento> history = new Stack<>();

    public void push(CourseMemento memento) {
        history.push(memento);
    }

    public CourseMemento pop() {
        return history.pop();
    }
}