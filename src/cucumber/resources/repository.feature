Feature: Repository Pattern
  As a developer
  I want to abstract data access
  So that I can separate business logic from data storage

  Scenario: Save and retrieve user
    Given a user repository exists
    When I save a user with id "1", name "John", email "john@example.com"
    Then I should be able to find user by id "1"
    And the user should have name "John"

  Scenario: Delete user
    Given a user repository exists
    When I save a user with id "1", name "John", email "john@example.com"
    And I delete user with id "1"
    Then user with id "1" should not exist
