Feature: Builder Pattern
  As a developer
  I want to build complex objects step by step
  So that I can create different configurations easily

  Scenario: Build a gaming computer
    Given I start building a computer
    When I set CPU to "Intel i9"
    And I set RAM to "32GB"
    And I set storage to "1TB SSD"
    And I set GPU to "RTX 4090"
    And I enable WiFi
    And I enable Bluetooth
    And I build the computer
    Then the computer should have CPU "Intel i9"
    And the computer should have RAM "32GB"
    And the computer should have WiFi enabled
