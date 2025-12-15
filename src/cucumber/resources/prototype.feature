Feature: Prototype
  As a developer
  I want to use the prototype pattern
  so that I can create copies of objects and modify them

  Scenario: Cloned circle has same radius and position as original
    Given I have a prototype circle with these properties
      | x  | y  | radius |
      | 10 | 20 | 5      |
    When I clone the circle
    Then the cloned circle has these properties
      | x  | y  | radius |
      | 10 | 20 | 5      |
    And the prototype circle has these properties
      | x  | y  | radius |
      | 10 | 20 | 5      |
