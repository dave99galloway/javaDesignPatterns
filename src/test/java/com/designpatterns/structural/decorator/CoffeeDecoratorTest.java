package com.designpatterns.structural.decorator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CoffeeDecoratorTest {
    
    @Test
    void testSimpleCoffee() {
        Coffee coffee = new SimpleCoffee();
        
        assertThat(coffee.getDescription()).isEqualTo("Simple Coffee");
        assertThat(coffee.getCost()).isEqualTo(2.0);
    }
    
    @Test
    void testCoffeeWithMilk() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        
        assertThat(coffee.getDescription()).isEqualTo("Simple Coffee, Milk");
        assertThat(coffee.getCost()).isEqualTo(2.5);
    }
    
    @Test
    void testCoffeeWithMilkAndSugar() {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        
        assertThat(coffee.getDescription()).isEqualTo("Simple Coffee, Milk, Sugar");
        assertThat(coffee.getCost()).isEqualTo(2.7);
    }
}
