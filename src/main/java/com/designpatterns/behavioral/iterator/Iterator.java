package com.designpatterns.behavioral.iterator;

/**
 * Iterator interface for Iterator pattern.
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
