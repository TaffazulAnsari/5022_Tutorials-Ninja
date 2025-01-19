# Author: Your Name
# Date: [Insert Date]
# Description: Feature for searching products on the website using various criteria.

Feature: Search Products
  As a user, I want to search for products using different search methods and criteria.

  Scenario: Search with existing product name
    Given I am on the main page
    When I search for an existing product "iPhone"
    Then I should see the product "iPhone" listed

  Scenario: Search with non-existing product name
    Given I am on the main page
    When I search for a non-existing product "sjsal"
    Then I should see a message indicating no products found

  Scenario: Search without entering any product name
    Given I am on the main page
    When I leave the search box empty
    Then I should see a message indicating no products found

  Scenario: Search with valid product after login
    Given I am logged in to my account
    When I search for a valid product "iPhone"
    Then I should see the product "iPhone" listed

  Scenario: Search with multiple criteria for products
    Given I am logged in to my account
    When I search for "iPhone MacBook"
    Then I should see a list of products matching the criteria

  Scenario: Verify search placeholder text
    Given I am on the main page
    When I check the search box placeholder
    Then the placeholder should be "placeholdersearchbox"

  Scenario: Search using search criteria field
    Given I am on the main page
    When I search using the criteria field for "iPhone"
    Then I should see the product "iPhone" listed

  Scenario: Search using product description criteria
    Given I am on the main page
    When I search using the product description criteria
    Then I should see the product "iPhone" listed

  Scenario: Search by selecting category
    Given I am on the main page
    When I select the "Mobiles" category and search for a product
    Then I should see products listed for the selected category

  Scenario: Search by selecting sub-categories
    Given I am on the main page
    When I select the sub-category "Mobile Phones" and search for a product
    Then I should see products listed for the selected sub-category

  Scenario: Verify product compare link
    Given I am on the main page
    When I search for "iPhone"
    And I click on the product compare link
    Then I should be redirected to the product comparison page
