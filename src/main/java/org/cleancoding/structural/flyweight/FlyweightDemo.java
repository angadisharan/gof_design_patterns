package org.cleancoding.structural.flyweight;

public class FlyweightDemo {

    public static void main(String[] args) {

        CourseCategory c1 = CourseCategoryFactory.getCategory("Design Patterns");
        c1.display("Singleton");

        CourseCategory c2 = CourseCategoryFactory.getCategory("Design Patterns");
        c2.display("Factory");

        CourseCategory c3 = CourseCategoryFactory.getCategory("System Design");
        c3.display("Load Balancing");

        // Check if same object reused
        System.out.println("c1 == c2 : " + (c1 == c2));
    }
}