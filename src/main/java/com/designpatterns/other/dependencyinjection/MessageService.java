package com.designpatterns.other.dependencyinjection;

/**
 * Dependency Injection pattern demonstrating constructor injection.
 */
public interface MessageService {
    void sendMessage(String message, String recipient);
}
