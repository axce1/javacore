package com.axce1_.javacore.oop.abstractfactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(AFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
