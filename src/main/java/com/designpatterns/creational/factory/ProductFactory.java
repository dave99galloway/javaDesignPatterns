package com.designpatterns.creational.factory;

/**
 * Factory Method pattern implementation.
 */
public class ProductFactory {
    public enum ProductType {
        TYPE_A, TYPE_B
    }

    public static Product createProduct(ProductType type) {
        return switch (type) {
            case TYPE_A -> new ConcreteProductA();
            case TYPE_B -> new ConcreteProductB();
        };
    }
}
