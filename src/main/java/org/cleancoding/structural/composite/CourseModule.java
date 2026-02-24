package org.cleancoding.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseModule implements CourseComponent {

    private String name;
    private List<CourseComponent> components = new ArrayList<>();

    public CourseModule(String name) {
        this.name = name;
    }

    public void add(CourseComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {

        System.out.println("Module: " + name);

        for (CourseComponent component : components) {
            component.showDetails();
        }
    }
}