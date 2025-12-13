package com.designpatterns.cucumber;

import com.designpatterns.behavioral.state.State;
import com.designpatterns.behavioral.state.VendingMachine;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class StateSteps {

    private final VendingMachine vendingMachine;

    public StateSteps(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Given("I have a new vending machine")
    public void iHaveANewVendingMachine() {
        assertThat(vendingMachine).isExactlyInstanceOf(VendingMachine.class).isNotNull();
    }

    @Then("the current state should be {string}")
    public void theCurrentStateShouldBe(String state) {
        assertThat(vendingMachine.getCurrentState()).returns(state, State::getStateName);
    }

    @When("I insert a coin")
    public void iInsertACoin() {
        vendingMachine.insertCoin();
    }

    @Given("I have inserted a coin in a new vending machine")
    public void iHaveInsertedACoinInANewVendingMachine() {
        vendingMachine.insertCoin();
        assertThat(vendingMachine.getCurrentState()).returns("HasCoin", State::getStateName);
    }

    @When("I eject the coin")
    public void iEjectTheCoin() {
        vendingMachine.ejectCoin();
    }

    @When("I dispense an item from the vending machine")
    public void iDispenseAnItemFromTheVendingMachine() {
        vendingMachine.dispense();
    }
}
