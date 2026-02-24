package org.cleancoding.structural.facade;

public class FacadeDemo {

    public static void main(String[] args) {

        CourseFacade facade = new CourseFacade();

        facade.startCourse();
    }
}