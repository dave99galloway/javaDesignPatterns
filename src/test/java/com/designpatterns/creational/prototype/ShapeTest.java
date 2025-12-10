package com.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ShapeTest {
    
    @Test
    void testCircleClone() {
        Circle original = new Circle();
        original.setColor("Red");
        original.setX(10);
        original.setY(20);
        original.setRadius(5);
        
        Circle cloned = (Circle) original.clone();
        
        assertThat(cloned).isNotSameAs(original);
        assertThat(cloned.getColor()).isEqualTo(original.getColor());
        assertThat(cloned.getX()).isEqualTo(original.getX());
        assertThat(cloned.getY()).isEqualTo(original.getY());
        assertThat(cloned.getRadius()).isEqualTo(original.getRadius());
    }
    
    @Test
    void testRectangleClone() {
        Rectangle original = new Rectangle();
        original.setColor("Blue");
        original.setX(5);
        original.setY(15);
        original.setWidth(100);
        original.setHeight(50);
        
        Rectangle cloned = (Rectangle) original.clone();
        
        assertThat(cloned).isNotSameAs(original);
        assertThat(cloned.getWidth()).isEqualTo(original.getWidth());
        assertThat(cloned.getHeight()).isEqualTo(original.getHeight());
    }
}
