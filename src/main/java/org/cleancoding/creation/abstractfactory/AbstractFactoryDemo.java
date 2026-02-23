package org.cleancoding.creation.abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        UIFactory factory = new DarkThemeFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();


        factory = new LightThemeFactory();

        button = factory.createButton();
        checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}