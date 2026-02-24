package org.cleancoding.structural.flyweight;

public class ConcreteCourseCategory implements CourseCategory {

    private String categoryName; // shared (intrinsic state)

    public ConcreteCourseCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public void display(String courseName) {
        System.out.println(courseName + " belongs to " + categoryName);
    }
}