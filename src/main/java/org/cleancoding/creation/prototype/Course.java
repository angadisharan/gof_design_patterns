package org.cleancoding.creation.prototype;

public class Course implements Cloneable {

    private String title;
    private String level;

    public Course(String title, String level) {
        this.title = title;
        this.level = level;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(title + " | " + level);
    }

    @Override
    protected Course clone() {
        try {
            return (Course) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}