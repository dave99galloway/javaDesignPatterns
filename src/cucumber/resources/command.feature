Feature: Command Pattern

  Scenario: Use Remote Control to turn a light on
    Given I have a Light
    And the light is switched off
    And I have the Remote Control
    When I switch the light on
    Then the light is switched on