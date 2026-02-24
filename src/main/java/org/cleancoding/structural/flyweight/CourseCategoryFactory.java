package org.cleancoding.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CourseCategoryFactory {

    private static Map<String, CourseCategory> categoryMap = new HashMap<>();

    public static CourseCategory getCategory(String categoryName) {

        if (!categoryMap.containsKey(categoryName)) {

            categoryMap.put(
                    categoryName,
                    new ConcreteCourseCategory(categoryName)
            );

            System.out.println("Creating new category: " + categoryName);
        }

        return categoryMap.get(categoryName);
    }
}