package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        System.out.println("Inside Step - I am on the main page");
    }

    @When("I enter {string} in the search box")
    public void iEnterInTheSearchBox(String product) {
        System.out.println("Inside Step - I enter " + product + " in the search box");
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() {
        System.out.println("Inside Step - I click on the search button");
    }

    @Then("I should see the products related to {string}")
    public void iShouldSeeTheProductsRelatedTo(String product) {
        System.out.println("Inside Step - I should see the products related to " + product);
    }

    @When("I enter {string} in the search box with no matching results")
    public void iEnterInTheSearchBoxWithNoMatchingResults(String product) {
        System.out.println("Inside Step - I enter " + product + " in the search box with no matching results");
    }

    @Then("I should see the no products found message")
    public void iShouldSeeTheNoProductsFoundMessage() {
        System.out.println("Inside Step - I should see the no products found message");
    }

    @When("I select {string} from the category dropdown")
    public void iSelectFromTheCategoryDropdown(String category) {
        System.out.println("Inside Step - I select " + category + " from the category dropdown");
    }

    @And("I click on the search criteria button")
    public void iClickOnTheSearchCriteriaButton() {
        System.out.println("Inside Step - I click on the search criteria button");
    }

    @Then("I should see the filtered products based on the search criteria")
    public void iShouldSeeTheFilteredProductsBasedOnTheSearchCriteria() {
        System.out.println("Inside Step - I should see the filtered products based on the search criteria");
    }

    @When("I click on the compare product button")
    public void iClickOnTheCompareProductButton() {
        System.out.println("Inside Step - I click on the compare product button");
    }

    @Then("I should see the product comparison link")
    public void iShouldSeeTheProductComparisonLink() {
        System.out.println("Inside Step - I should see the product comparison link");
    }

    @When("I click on the product comparison link")
    public void iClickOnTheProductComparisonLink() {
        System.out.println("Inside Step - I click on the product comparison link");
    }

    @Then("I should see the product comparison page")
    public void iShouldSeeTheProductComparisonPage() {
        System.out.println("Inside Step - I should see the product comparison page");
    }

    @When("I click on the add to cart button from the product page")
    public void iClickOnTheAddToCartButtonFromTheProductPage() {
        System.out.println("Inside Step - I click on the add to cart button from the product page");
    }

    @Then("I should see the shopping cart link")
    public void iShouldSeeTheShoppingCartLink() {
        System.out.println("Inside Step - I should see the shopping cart link");
    }

    @When("I click on the add to cart button from the search results")
    public void iClickOnTheAddToCartButtonFromTheSearchResults() {
        System.out.println("Inside Step - I click on the add to cart button from the search results");
    }

    @Then("I should see the shopping cart link from the search results")
    public void iShouldSeeTheShoppingCartLinkFromTheSearchResults() {
        System.out.println("Inside Step - I should see the shopping cart link from the search results");
    }
}
