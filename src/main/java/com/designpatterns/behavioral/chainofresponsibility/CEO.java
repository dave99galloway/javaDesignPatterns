package com.designpatterns.behavioral.chainofresponsibility;

public class CEO extends Handler {
    @Override
    public void handleRequest(String request, int amount) {
        System.out.println("CEO approved: " + request + " - $" + amount);
    }
}
