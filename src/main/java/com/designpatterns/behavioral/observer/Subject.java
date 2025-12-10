package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject interface for Observer pattern.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
