package com.designpatterns.creational.abstractfactory;

/**
 * Abstract Factory pattern implementation for UI components.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
