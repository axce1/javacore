package com.axce1_.javacore.oop.abstractfactory;

public class LinuxFactory implements AFactory {
    @Override
    public Button createButton() {
        return new LinuxBtn();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
