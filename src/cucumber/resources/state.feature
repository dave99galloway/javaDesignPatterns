Feature: State Pattern
  As a developer
  I want to keep track of state in my system
  So that I can choose correct behaviours for performed interactions based on the current state of the system

  Scenario: Inserting a coin in the vending machine should change the state to Has Coin
    Given I have a new vending machine
    When I insert a coin
    Then the current state should be "HasCoin"

  Scenario: Vending machine has no coin by default
  This demonstrates an interesting cucumber jvm implementation detail - state does not leak between scenarios,
  new instances of step defs are created for each scenario, so the previous scenario having set the state to HasCoin does not make this test fail.
  HOWEVER we might need before or after hooks to clean up state in external dependencies like DBs or drivers or applications.
    Given I have a new vending machine
    Then the current state should be "NoCoin"

  Scenario: Ejecting a coin from the vending machine should change the state to NoCoin
    Given I have inserted a coin in a new vending machine
    When I eject the coin
    Then the current state should be "NoCoin"

  Scenario: Dispensing an item from the vending machine should change the state to NoCoin
    Given I have inserted a coin in a new vending machine
    When I dispense an item from the vending machine
    Then the current state should be "NoCoin"