Feature: Prototype
  As a developer
  I want to use the prototype pattern
  so that I can create copies of objects and modify them

  Background: Define Prototypes
    Given I have a prototype circle with these properties
      | x  | y  | radius |
      | 10 | 20 | 5      |

  Scenario: Cloned circle has same radius and position as original
    When I clone the circle
    Then the cloned circle has these properties
      | x  | y  | radius |
      | 10 | 20 | 5      |
    And the prototype circle has these properties
      | x  | y  | radius |
      | 10 | 20 | 5      |

  Scenario: Updating the properties of the cloned circle does not alter the prototype
    And I have cloned the circle
    When I update the clone with these properties
      | x  | y  | radius |
      | 11 | 21 | 6      |
    Then the cloned circle has these properties
      | x  | y  | radius |
      | 11 | 21 | 6      |
    And the prototype circle has these properties
      | x  | y  | radius |
      | 10 | 20 | 5      |


  Scenario: Updating the radius of the cloned circle does not alter the prototype
    And I have cloned the circle
    When I update the clone with these properties
      | radius |
      | 6      |
    Then the cloned circle has these properties
      | x  | y  | radius |
      | 10 | 20 | 6      |
    And the prototype circle has these properties
      | x  | y  | radius |
      | 10 | 20 | 5      |