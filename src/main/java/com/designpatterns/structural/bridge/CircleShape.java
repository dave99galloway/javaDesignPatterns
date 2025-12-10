package com.designpatterns.structural.bridge;

public class CircleShape extends Shape {
    public CircleShape(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Circle filled with " + color.fill() + " color";
    }
}
