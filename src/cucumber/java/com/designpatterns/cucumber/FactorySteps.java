package com.designpatterns.cucumber;

import com.designpatterns.creational.factory.*;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.*;

public class FactorySteps {
    private Product product;
    
    @When("I create a product of type {string}")
    public void iCreateAProductOfType(String type) {
        ProductFactory.ProductType productType = ProductFactory.ProductType.valueOf(type);
        product = ProductFactory.createProduct(productType);
    }
    
    @Then("the product name should be {string}")
    public void theProductNameShouldBe(String expectedName) {
        assertThat(product.getName()).isEqualTo(expectedName);
    }
    
    @Then("the product price should be {double}")
    public void theProductPriceShouldBe(double expectedPrice) {
        assertThat(product.getPrice()).isEqualTo(expectedPrice);
    }
}
