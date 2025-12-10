Feature: Decorator Pattern
  As a developer
  I want to add functionality to objects dynamically
  So that I can extend behavior without modifying classes

  Scenario: Simple coffee
    Given I order a simple coffee
    Then the description should be "Simple Coffee"
    And the cost should be 2.0

  Scenario: Coffee with milk
    Given I order a simple coffee
    When I add milk
    Then the description should be "Simple Coffee, Milk"
    And the cost should be 2.5

  Scenario: Coffee with milk and sugar
    Given I order a simple coffee
    When I add milk
    And I add sugar
    Then the description should be "Simple Coffee, Milk, Sugar"
    And the cost should be 2.7
