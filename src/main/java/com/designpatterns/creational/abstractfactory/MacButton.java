package com.designpatterns.creational.abstractfactory;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac button");
    }
    
    @Override
    public void onClick() {
        System.out.println("Mac button clicked");
    }
    
    @Override
    public String getStyle() {
        return "Mac";
    }
}
