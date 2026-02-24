package org.cleancoding.behavioural.memento;

public class MementoDemo {

    public static void main(String[] args) {

        CourseEditor editor = new CourseEditor();
        History history = new History();

        editor.setContent("Version 1");
        history.push(editor.save());

        editor.setContent("Version 2");
        history.push(editor.save());

        editor.setContent("Version 3");

        // Undo
        editor.restore(history.pop());
    }
}