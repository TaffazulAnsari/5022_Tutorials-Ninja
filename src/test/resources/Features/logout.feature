# Author: Your Name
# Date: [Insert Date]
# Description: Feature for logging out from the application using various methods.

Feature: Logout
  As a user, I want to log out from my account using different options provided on the website.

  Scenario: Logout from my account dropdown
    Given I am logged in to my account
    When I click on the "My Account" dropdown
    And I select the logout option
    Then I should see a confirmation that I have logged out

  Scenario: Logout from the right bottom corner
    Given I am logged in to my account
    When I click on the logout option in the right bottom corner
    Then I should see a confirmation that I have logged out
