Feature: Observer Pattern
  As a developer
  I want to notify multiple observers of changes
  So that I can implement event-driven architecture

  Scenario: Notify observers of news update
    Given a news agency exists
    And a news channel "CNN" is subscribed
    And a news channel "BBC" is subscribed
    When the agency publishes "Breaking News"
    Then "CNN" should receive "Breaking News"
    And "BBC" should receive "Breaking News"

  Scenario: Unsubscribe observer
    Given a news agency exists
    And a news channel "CNN" is subscribed
    When the agency publishes "First News"
    Then "CNN" should receive "First News"
    When "CNN" unsubscribes
    And the agency publishes "Second News"
    Then "CNN" should still have "First News"
