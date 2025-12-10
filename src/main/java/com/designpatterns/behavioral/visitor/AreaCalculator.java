package com.designpatterns.behavioral.visitor;

public class AreaCalculator implements ShapeVisitor {
    private double totalArea = 0;
    
    @Override
    public void visit(CircleElement circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        totalArea += area;
        System.out.println("Circle area: " + area);
    }
    
    @Override
    public void visit(RectangleElement rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        totalArea += area;
        System.out.println("Rectangle area: " + area);
    }
    
    public double getTotalArea() {
        return totalArea;
    }
}
