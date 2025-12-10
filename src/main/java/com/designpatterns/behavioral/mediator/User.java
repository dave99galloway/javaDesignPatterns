package com.designpatterns.behavioral.mediator;

public class User {
    private String name;
    private ChatMediator mediator;
    private String lastReceivedMessage;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println(name + " sending: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        this.lastReceivedMessage = message;
        System.out.println(name + " received: " + message);
    }

    public String getName() {
        return name;
    }

    public String getLastReceivedMessage() {
        return lastReceivedMessage;
    }
}
