package org.cleancoding.creation.abstractfactory;

public class DarkThemeFactory implements UIFactory {

    public Button createButton() {
        return new DarkButton();
    }

    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}