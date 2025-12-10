package com.designpatterns.creational.singleton;

/**
 * Thread-safe Singleton pattern implementation using enum.
 * This is the recommended approach for implementing Singleton in Java.
 */
public enum Singleton {
    INSTANCE;
    
    private String data;
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return data;
    }
    
    public String performOperation() {
        return "Singleton operation executed with data: " + data;
    }
}
