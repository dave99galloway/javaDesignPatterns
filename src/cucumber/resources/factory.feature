Feature: Factory Pattern
  As a developer
  I want to create products using a factory
  So that I can decouple object creation from usage

  Scenario: Create Product A
    When I create a product of type "TYPE_A"
    Then the product name should be "Product A"
    And the product price should be 29.99

  Scenario: Create Product B
    When I create a product of type "TYPE_B"
    Then the product name should be "Product B"
    And the product price should be 19.99
