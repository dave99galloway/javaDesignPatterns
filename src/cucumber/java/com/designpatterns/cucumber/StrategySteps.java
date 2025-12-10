package com.designpatterns.cucumber;

import com.designpatterns.behavioral.strategy.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.*;

public class StrategySteps {
    private ShoppingCart cart;
    private Exception exception;

    @Given("a shopping cart exists")
    public void aShoppingCartExists() {
        cart = new ShoppingCart();
        exception = null;
    }

    @When("I set payment strategy to credit card {string}")
    public void iSetPaymentStrategyToCreditCard(String cardNumber) {
        cart.setPaymentStrategy(new CreditCardStrategy(cardNumber));
    }

    @When("I set payment strategy to PayPal {string}")
    public void iSetPaymentStrategyToPayPal(String email) {
        cart.setPaymentStrategy(new PayPalStrategy(email));
    }

    @When("I checkout with amount {double}")
    public void iCheckoutWithAmount(double amount) {
        try {
            cart.checkout(amount);
        } catch (Exception e) {
            exception = e;
        }
    }

    @When("I checkout with amount {double} without setting a strategy")
    public void iCheckoutWithAmountWithoutSettingAStrategy(double amount) {
        try {
            cart.checkout(amount);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Then("the payment should be processed successfully")
    public void thePaymentShouldBeProcessedSuccessfully() {
        assertThat(exception).isNull();
    }

    @Then("an error should occur")
    public void anErrorShouldOccur() {
        assertThat(exception).isNotNull()
                .isInstanceOf(IllegalStateException.class);
    }
}
