package com.designpatterns.creational.factory;

public class ConcreteProductB implements Product {
    @Override
    public String getName() {
        return "Product B";
    }

    @Override
    public double getPrice() {
        return 19.99;
    }

    @Override
    public String getDescription() {
        return "This is Product B - a budget-friendly option";
    }
}
