package com.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight pattern factory for managing shared objects.
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getCircle(String type) {
        Shape shape = shapes.get(type);

        if (shape == null) {
            shape = new Circle(type);
            shapes.put(type, shape);
            System.out.println("Creating new circle of type: " + type);
        }

        return shape;
    }

    public static int getTotalShapes() {
        return shapes.size();
    }
}
