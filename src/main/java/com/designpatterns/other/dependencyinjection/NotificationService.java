package com.designpatterns.other.dependencyinjection;

public class NotificationService {
    private MessageService messageService;

    // Constructor Injection
    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message, String recipient) {
        messageService.sendMessage(message, recipient);
    }

    public MessageService getMessageService() {
        return messageService;
    }
}
