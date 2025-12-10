package com.designpatterns.creational.prototype;

/**
 * Prototype pattern implementation for cloning objects.
 */
public abstract class Shape implements Cloneable {
    protected String color;
    protected int x;
    protected int y;
    
    public Shape() {
    }
    
    public Shape(Shape source) {
        if (source != null) {
            this.color = source.color;
            this.x = source.x;
            this.y = source.y;
        }
    }
    
    public abstract Shape clone();
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
}
