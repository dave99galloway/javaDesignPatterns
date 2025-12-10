package com.designpatterns.creational.factory;

public class ConcreteProductA implements Product {
    @Override
    public String getName() {
        return "Product A";
    }

    @Override
    public double getPrice() {
        return 29.99;
    }

    @Override
    public String getDescription() {
        return "This is Product A - a premium product";
    }
}
