package com.axce1_.javacore.oop.abstractfactory;

public class WinFactory implements AFactory {
    @Override
    public Button createButton() {
        return new WinBtn();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
