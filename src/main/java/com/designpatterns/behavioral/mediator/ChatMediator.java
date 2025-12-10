package com.designpatterns.behavioral.mediator;

/**
 * Mediator interface for Mediator pattern.
 */
public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
