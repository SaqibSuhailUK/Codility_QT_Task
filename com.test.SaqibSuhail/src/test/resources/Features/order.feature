#Author: Saqib Suhail
#Purpose: Codility task
@start1
Feature: Order a t-shirt and verify the order history then update first name of user

  @UK1
  Scenario: Login and Order a t-shirt and verify the order history
    Given user is on login page with credentials
    When user completes the order of a t-shirt
    Then verify the order in order history

  @UK2
  Scenario: Update the first name of user
    Given user is on login page with credentials again
    When user updates the first name
    Then save the updated information
