package com.designpatterns.creational.singleton;

/**
 * Alternative Singleton implementation using double-checked locking.
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    private String data;

    private ThreadSafeSingleton() {
        // Private constructor to prevent instantiation
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
