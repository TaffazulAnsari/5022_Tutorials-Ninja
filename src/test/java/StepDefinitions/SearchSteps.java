package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        System.out.println("Inside Step - I am on the main page");
    }

    @When("I search for an existing product {string}")
    public void iSearchForAnExistingProduct(String productName) {
        System.out.println("Inside Step - I search for an existing product " + productName);
    }

    @Then("I should see the product {string} listed")
    public void iShouldSeeTheProductListed(String productName) {
        System.out.println("Inside Step - I should see the product " + productName + " listed");
    }

    @When("I search for a non-existing product {string}")
    public void iSearchForANonExistingProduct(String productName) {
        System.out.println("Inside Step - I search for a non-existing product " + productName);
    }

    @Then("I should see a message indicating no products found")
    public void iShouldSeeAMessageIndicatingNoProductsFound() {
        System.out.println("Inside Step - I should see a message indicating no products found");
    }

    @When("I leave the search box empty")
    public void iLeaveTheSearchBoxEmpty() {
        System.out.println("Inside Step - I leave the search box empty");
    }

    @Given("I am logged in to my account")
    public void iAmLoggedInToMyAccount() {
        System.out.println("Inside Step - I am logged in to my account");
    }

    @When("I search for a valid product {string}")
    public void iSearchForAValidProduct(String productName) {
        System.out.println("Inside Step - I search for a valid product " + productName);
    }

    @When("I search for {string}")
    public void iSearchFor(String products) {
        System.out.println("Inside Step - I search for " + products);
    }

    @When("I check the search box placeholder")
    public void iCheckTheSearchBoxPlaceholder() {
        System.out.println("Inside Step - I check the search box placeholder");
    }

    @Then("the placeholder should be {string}")
    public void thePlaceholderShouldBe(String placeholder) {
        System.out.println("Inside Step - The placeholder should be " + placeholder);
    }

    @When("I search using the criteria field for {string}")
    public void iSearchUsingTheCriteriaFieldFor(String productName) {
        System.out.println("Inside Step - I search using the criteria field for " + productName);
    }

    @When("I search using the product description criteria")
    public void iSearchUsingTheProductDescriptionCriteria() {
        System.out.println("Inside Step - I search using the product description criteria");
    }

    @When("I select the {string} category and search for a product")
    public void iSelectTheCategoryAndSearchForAProduct(String category) {
        System.out.println("Inside Step - I select the " + category + " category and search for a product");
    }

    @When("I select the sub-category {string} and search for a product")
    public void iSelectTheSubCategoryAndSearchForAProduct(String subCategory) {
        System.out.println("Inside Step - I select the sub-category " + subCategory + " and search for a product");
    }

    @When("I click on the product compare link")
    public void iClickOnTheProductCompareLink() {
        System.out.println("Inside Step - I click on the product compare link");
    }

    @Then("I should be redirected to the product comparison page")
    public void iShouldBeRedirectedToTheProductComparisonPage() {
        System.out.println("Inside Step - I should be redirected to the product comparison page");
    }
}
