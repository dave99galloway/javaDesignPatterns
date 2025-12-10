package com.designpatterns.behavioral.chainofresponsibility;

public class Manager extends Handler {
    private static final int APPROVAL_LIMIT = 1000;

    @Override
    public void handleRequest(String request, int amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Manager approved: " + request + " - $" + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request, amount);
        }
    }
}
