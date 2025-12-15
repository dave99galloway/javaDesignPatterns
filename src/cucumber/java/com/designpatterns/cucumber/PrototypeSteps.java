package com.designpatterns.cucumber;

import com.designpatterns.creational.prototype.Circle;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class PrototypeSteps {

    private Circle protoCircle;
    private Circle clonedCircle;

    @Given("I have a prototype circle with these properties")
    public void iHaveAprototypeCircleWithTheseProperties(Circle circle) {
        protoCircle = circle;
    }

    @When("I clone the circle")
    public void iCloneTheCircle() {
        clonedCircle = Circle.clone(protoCircle);
    }

    @Then("the cloned circle has these properties")
    public void theClonedCircleHasTheseProperties(Circle circle) {
        assertThat(clonedCircle).usingRecursiveComparison().isEqualTo(circle);
        assertThat(clonedCircle).isNotEqualTo(circle);
    }

    @And("the prototype circle has these properties")
    public void theprototypeCircleHasTheseProperties(Circle circle) {
        assertThat(protoCircle).usingRecursiveComparison().isEqualTo(circle);
        assertThat(clonedCircle).isNotEqualTo(circle);
    }
}
