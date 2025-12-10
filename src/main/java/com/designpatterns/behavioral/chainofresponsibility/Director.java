package com.designpatterns.behavioral.chainofresponsibility;

public class Director extends Handler {
    private static final int APPROVAL_LIMIT = 5000;
    
    @Override
    public void handleRequest(String request, int amount) {
        if (amount <= APPROVAL_LIMIT) {
            System.out.println("Director approved: " + request + " - $" + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request, amount);
        }
    }
}
