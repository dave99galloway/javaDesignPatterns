package com.designpatterns.structural.composite;

public class Leaf implements Component {
    private String name;
    private double price;
    
    public Leaf(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void showDetails() {
        System.out.println(name + " - $" + price);
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}
