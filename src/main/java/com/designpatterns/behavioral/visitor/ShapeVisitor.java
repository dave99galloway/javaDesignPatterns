package com.designpatterns.behavioral.visitor;

/**
 * Visitor interface for Visitor pattern.
 */
public interface ShapeVisitor {
    void visit(CircleElement circle);

    void visit(RectangleElement rectangle);
}
