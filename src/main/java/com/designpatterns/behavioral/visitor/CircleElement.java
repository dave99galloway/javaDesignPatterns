package com.designpatterns.behavioral.visitor;

public class CircleElement implements ShapeElement {
    private int radius;
    
    public CircleElement(int radius) {
        this.radius = radius;
    }
    
    public int getRadius() {
        return radius;
    }
    
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
