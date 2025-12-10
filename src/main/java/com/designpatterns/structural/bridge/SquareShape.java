package com.designpatterns.structural.bridge;

public class SquareShape extends Shape {
    public SquareShape(Color color) {
        super(color);
    }
    
    @Override
    public String draw() {
        return "Square filled with " + color.fill() + " color";
    }
}
