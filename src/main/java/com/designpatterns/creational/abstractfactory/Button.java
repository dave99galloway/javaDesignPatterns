package com.designpatterns.creational.abstractfactory;

/**
 * Abstract product for UI Button.
 */
public interface Button {
    void render();

    void onClick();

    String getStyle();
}
