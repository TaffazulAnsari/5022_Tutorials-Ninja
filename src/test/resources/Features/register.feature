# Author: Your Name
# Date: [Insert Date]
# Description: Feature for registering users with valid and invalid inputs.

Feature: User Registration
  As a user, I want to register on the application using valid and invalid details.

  Scenario: Register with valid details
    Given I am on the registration page
    When I enter valid registration details
    And I click on the continue button
    Then I should see the registration success message

  Scenario: Register with an existing email
    Given I am on the registration page
    When I enter registration details with an existing email
    And I click on the continue button
    Then I should see the existing email warning message

  Scenario: Register without agreeing to privacy policy
    Given I am on the registration page
    When I enter valid registration details without agreeing to the privacy policy
    And I click on the continue button
    Then I should see the privacy policy warning message

  Scenario: Register with mismatched passwords
    Given I am on the registration page
    When I enter passwords that do not match
    And I click on the continue button
    Then I should see the password mismatch warning message
