package com.designpatterns.creational.factory;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ProductFactoryTest {

    @Test
    void testCreateProductA() {
        Product product = ProductFactory.createProduct(ProductFactory.ProductType.TYPE_A);

        assertThat(product).isInstanceOf(ConcreteProductA.class);
        assertThat(product.getName()).isEqualTo("Product A");
        assertThat(product.getPrice()).isEqualTo(29.99);
    }

    @Test
    void testCreateProductB() {
        Product product = ProductFactory.createProduct(ProductFactory.ProductType.TYPE_B);

        assertThat(product).isInstanceOf(ConcreteProductB.class);
        assertThat(product.getName()).isEqualTo("Product B");
        assertThat(product.getPrice()).isEqualTo(19.99);
    }
}
