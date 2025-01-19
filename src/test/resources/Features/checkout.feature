Feature: Checkout Process

  Scenario: User initiates checkout and completes the process successfully
    Given I am on the shopping cart page
    When I click on the checkout button
    Then I should see the billing address continue button

  Scenario: User continues to billing address
    Given I have clicked on the checkout button
    When I continue to the billing address
    Then I should see the delivery address continue button

  Scenario: User continues to delivery address
    Given I have completed the billing address step
    When I continue to the delivery address
    Then I should see the delivery method continue button

  Scenario: User continues to delivery method
    Given I have completed the delivery address step
    When I continue to the delivery method
    Then I should see the payment method continue button
    

  Scenario: User continues to payment method
    Given I have completed the delivery method step
    When I continue to the payment method
    Then I should see the confirm order button


  Scenario: User confirms the order
    Given I have completed the payment method step
    When I confirm the order
    Then I should see the order confirmation message
 