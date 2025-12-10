package com.designpatterns.behavioral.strategy;

/**
 * Strategy interface for Strategy pattern.
 */
public interface PaymentStrategy {
    void pay(double amount);
    String getPaymentType();
}
