# Author
# Date
# Description

Feature: login Feature
  As a user, I want to log in to the application using valid and invalid credentials.

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid email and password
    And I click on the login button
    Then I should see the "Edit your account information" link

  Scenario: Login with invalid credentials
    Given I am on the login page
    When I enter invalid email and password
    And I click on the login button
    Then I should see a warning message

  Scenario: Login without credentials
    Given I am on the login page
    When I leave email and password fields empty
    And I click on the login button
    Then I should see a warning message
