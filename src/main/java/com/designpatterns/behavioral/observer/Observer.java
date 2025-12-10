package com.designpatterns.behavioral.observer;

/**
 * Observer interface for Observer pattern.
 */
public interface Observer {
    void update(String message);
    String getName();
}
