package com.designpatterns.behavioral.chainofresponsibility;

/**
 * Handler interface for Chain of Responsibility pattern.
 */
public abstract class Handler {
    protected Handler nextHandler;

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(String request, int amount);
}
