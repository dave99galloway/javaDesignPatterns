package com.designpatterns.cucumber;

import com.designpatterns.creational.singleton.Singleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.*;

public class SingletonSteps {
    private Singleton instance1;
    private Singleton instance2;
    private String operationResult;
    
    @Given("I access the Singleton instance")
    public void iAccessTheSingletonInstance() {
        instance1 = Singleton.INSTANCE;
    }
    
    @When("I set data to {string}")
    public void iSetDataTo(String data) {
        Singleton.INSTANCE.setData(data);
    }
    
    @When("I access the Singleton instance again")
    public void iAccessTheSingletonInstanceAgain() {
        instance2 = Singleton.INSTANCE;
    }
    
    @Then("both instances should be the same")
    public void bothInstancesShouldBeTheSame() {
        assertThat(instance1).isSameAs(instance2);
    }
    
    @Then("the data should be {string}")
    public void theDataShouldBe(String expectedData) {
        assertThat(Singleton.INSTANCE.getData()).isEqualTo(expectedData);
    }
    
    @When("I perform an operation")
    public void iPerformAnOperation() {
        operationResult = Singleton.INSTANCE.performOperation();
    }
    
    @Then("the result should contain {string}")
    public void theResultShouldContain(String expected) {
        assertThat(operationResult).contains(expected);
    }
}
