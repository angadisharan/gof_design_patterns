package org.cleancoding.structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        Lesson lesson1 = new Lesson("Singleton Pattern");
        Lesson lesson2 = new Lesson("Factory Pattern");

        CourseModule module = new CourseModule("Creational Patterns");

        module.add(lesson1);
        module.add(lesson2);


        CourseModule compositeModule = new CourseModule("Structural Patterns");
        Lesson compositeLesson1 = new Lesson("Adapter Pattern");
        Lesson compositeLesson2 = new Lesson("Bridge Pattern");

        compositeModule.add(compositeLesson1);
        compositeModule.add(compositeLesson2);



        CourseModule fullCourse = new CourseModule("Full Course");
        fullCourse.add(module);
        fullCourse.add(compositeModule);

        fullCourse.showDetails();


    }
}

// Example below
// Full Course
//   ├── Creational Patterns (module)
//   │        ├── Lesson
//   │        └── Lesson
//   └── Structural Patterns (module)
//            ├── Lesson
//            └── Lesson