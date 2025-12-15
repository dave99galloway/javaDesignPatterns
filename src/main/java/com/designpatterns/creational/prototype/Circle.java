package com.designpatterns.creational.prototype;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    public void update(CircleUpdate updates) {
        if (updates != null) {
            x = updates.x().orElse(x);
            y = updates.y().orElse(y);
            radius = updates.radius().orElse(radius);
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
