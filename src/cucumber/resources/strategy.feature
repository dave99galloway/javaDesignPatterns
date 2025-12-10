Feature: Strategy Pattern
  As a developer
  I want to select payment strategies at runtime
  So that I can support multiple payment methods

  Scenario: Pay with credit card
    Given a shopping cart exists
    When I set payment strategy to credit card "1234-5678"
    And I checkout with amount 100.0
    Then the payment should be processed successfully

  Scenario: Pay with PayPal
    Given a shopping cart exists
    When I set payment strategy to PayPal "user@example.com"
    And I checkout with amount 50.0
    Then the payment should be processed successfully

  Scenario: Checkout without payment strategy
    Given a shopping cart exists
    When I checkout with amount 100.0 without setting a strategy
    Then an error should occur
