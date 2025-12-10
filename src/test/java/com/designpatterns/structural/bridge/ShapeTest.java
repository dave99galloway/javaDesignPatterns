package com.designpatterns.structural.bridge;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ShapeTest {
    
    @Test
    void testCircleWithRedColor() {
        Shape shape = new CircleShape(new RedColor());
        String result = shape.draw();
        
        assertThat(result).isEqualTo("Circle filled with Red color");
    }
    
    @Test
    void testSquareWithBlueColor() {
        Shape shape = new SquareShape(new BlueColor());
        String result = shape.draw();
        
        assertThat(result).isEqualTo("Square filled with Blue color");
    }
}
