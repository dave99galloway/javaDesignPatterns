package com.designpatterns.creational.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
    
    @Override
    public void onClick() {
        System.out.println("Windows button clicked");
    }
    
    @Override
    public String getStyle() {
        return "Windows";
    }
}
