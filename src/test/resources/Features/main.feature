# Author: Your Name
# Date: [Insert Date]
# Description: Feature for interacting with the main page, including search functionality, product comparison, and adding to cart.

Feature: Main Page Functionality
  As a user, I want to perform various actions on the main page including searching for products, comparing products, and adding products to the cart.

  Scenario: Verify search functionality
    Given I am on the main page
    When I search for "MacBook"
    Then I should see the products listed

  Scenario: Verify no products found message
    Given I am on the main page
    When I search for "NonExistingProduct"
    Then I should see a message indicating no products found

  Scenario: Verify advanced search criteria
    Given I am on the main page
    When I search for "Laptop" under "Laptops & Notebooks" category
    Then I should see the products listed based on the advanced search criteria

  Scenario: Verify compare product button functionality
    Given I am on the main page
    When I click on the "Compare" button for a product
    Then I should be redirected to the product comparison link

  Scenario: Verify product comparison page
    Given I am on the product comparison page
    When I click on the product comparison link
    Then I should see the product comparison page displayed

  Scenario: Verify add to cart functionality from product page
    Given I am on a product page
    When I click on "Add to Cart"
    Then I should see the shopping cart link displayed

  Scenario: Verify add to cart functionality from search results
    Given I am on the main page
    When I search for "MacBook"
    And I click on "Add to Cart" from the search results
    Then I should see the shopping cart link displayed
