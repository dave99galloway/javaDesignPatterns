Feature: Singleton Pattern
  As a developer
  I want to ensure only one instance exists
  So that I can share state across the application

  Scenario: Get singleton instance
    Given I access the Singleton instance
    When I set data to "test data"
    And I access the Singleton instance again
    Then both instances should be the same
    And the data should be "test data"

  Scenario: Singleton operation
    Given I access the Singleton instance
    When I set data to "hello world"
    And I perform an operation
    Then the result should contain "hello world"
