Feature: Lead functionality

  Background:
    Given user should be on login
    When user enters valid credentilas

@cl
Scenario Outline: Create Lead
   When user click on new lead link
   And fill mandatory fields and click save button
   Then Lead should be created successfully
   And close browser
  Examples:
  |lname | comp |
  |Shah  | BJP  |
  |Gupta | BJP  |
  |Gandhi| congress|
  |Kohali|India    |