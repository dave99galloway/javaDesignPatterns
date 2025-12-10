package com.designpatterns.cucumber;

import com.designpatterns.structural.decorator.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.*;

public class DecoratorSteps {
    private Coffee coffee;
    
    @Given("I order a simple coffee")
    public void iOrderASimpleCoffee() {
        coffee = new SimpleCoffee();
    }
    
    @When("I add milk")
    public void iAddMilk() {
        coffee = new MilkDecorator(coffee);
    }
    
    @When("I add sugar")
    public void iAddSugar() {
        coffee = new SugarDecorator(coffee);
    }
    
    @Then("the description should be {string}")
    public void theDescriptionShouldBe(String expectedDescription) {
        assertThat(coffee.getDescription()).isEqualTo(expectedDescription);
    }
    
    @Then("the cost should be {double}")
    public void theCostShouldBe(double expectedCost) {
        assertThat(coffee.getCost()).isEqualTo(expectedCost);
    }
}
