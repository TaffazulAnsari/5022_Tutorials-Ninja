# Author: Your Name
# Date: [Insert Date]
# Description: Feature for adding products to the cart through different flows.

Feature: Add to Cart
  As a user, I want to add products to my cart from various sections of the website.

  Scenario: Add product to cart from the product page
    Given I am on the product page
    When I click on the add to cart button
    And I go to the shopping cart page
    Then I should see the checkout button

  Scenario: Add product to cart from the wishlist
    Given I am logged in to my account
    When I add a product to my wishlist
    And I go to the wishlist page
    Then I should see the product in the wishlist

  Scenario: Add product to cart from search results
    Given I search for a product
    When I add the product to the cart from search results
    And I go to the shopping cart page
    Then I should see the checkout button

  Scenario: Add product to cart from the product display page
    Given I search for a product
    When I view the product details
    And I click on the add to cart button
    Then I should see the checkout button on the cart page

  Scenario: Add product to cart from the featured section
    Given I am on the homepage
    When I scroll to the featured section
    And I click on the add to cart button
    Then I should see the checkout button on the cart page

  Scenario: Add product to cart from the product comparison page
    Given I search for a product
    When I compare the product
    And I add the product to the cart from the comparison page
    Then I should see the checkout button on the cart page
