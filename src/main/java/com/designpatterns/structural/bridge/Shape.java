package com.designpatterns.structural.bridge;

/**
 * Bridge pattern abstraction.
 */
public abstract class Shape {
    protected Color color;
    
    protected Shape(Color color) {
        this.color = color;
    }
    
    public abstract String draw();
}
