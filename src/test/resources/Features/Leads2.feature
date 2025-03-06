@tg1
Feature: Lead 2 functionality




  @cl2
  Scenario: Create Lead step parameterization
    Given user should be on login
    When user enters valid credentilas
    And user create the lead with data "<lname>" and "<comp>" and verify successful lead creation
      |lname | comp |
      |Shah  | BJP  |
      |Gupta | BJP  |
      |Gandhi| congress|
      |Kohali|India    |
    And close browser

