package com.designpatterns.behavioral.visitor;

public class RectangleElement implements ShapeElement {
    private int width;
    private int height;

    public RectangleElement(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
