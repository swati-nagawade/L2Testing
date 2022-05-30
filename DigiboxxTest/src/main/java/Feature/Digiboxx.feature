Feature: feature to test the login action

  @smokeTest
  Scenario: Succefull login with valid credentials
    Given User is on google chrome
    And User navigates to login page
    Then User enters valid Digispace and Email and Password
    And User presses login button
    Then User clicks click here
    And User creates a folder
    Then User clicks add button and selects upload file from dropdown menu
