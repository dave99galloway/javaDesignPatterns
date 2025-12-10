package com.designpatterns.creational.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac checkbox");
    }

    @Override
    public void toggle() {
        System.out.println("Mac checkbox toggled");
    }

    @Override
    public String getStyle() {
        return "Mac";
    }
}
