package com.designpatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class StrategyTest {

    @Test
    void testCreditCardStrategy() {
        ShoppingCart cart = new ShoppingCart();
        PaymentStrategy strategy = new CreditCardStrategy("1234-5678-9012-3456");
        cart.setPaymentStrategy(strategy);

        assertThatCode(() -> cart.checkout(100.0)).doesNotThrowAnyException();
    }

    @Test
    void testPayPalStrategy() {
        ShoppingCart cart = new ShoppingCart();
        PaymentStrategy strategy = new PayPalStrategy("user@example.com");
        cart.setPaymentStrategy(strategy);

        assertThatCode(() -> cart.checkout(50.0)).doesNotThrowAnyException();
    }

    @Test
    void testNoStrategySet() {
        ShoppingCart cart = new ShoppingCart();

        assertThatThrownBy(() -> cart.checkout(100.0))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Payment strategy not set");
    }
}
