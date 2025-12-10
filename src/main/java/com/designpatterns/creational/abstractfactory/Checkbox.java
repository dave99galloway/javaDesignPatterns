package com.designpatterns.creational.abstractfactory;

/**
 * Abstract product for UI Checkbox.
 */
public interface Checkbox {
    void render();
    void toggle();
    String getStyle();
}
