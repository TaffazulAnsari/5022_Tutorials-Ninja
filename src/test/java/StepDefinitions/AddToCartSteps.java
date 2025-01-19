package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {

    @Given("I am on the product page")
    public void iAmOnTheProductPage() {
        System.out.println("Inside Step - I am on the product page");
    }

    @When("I click on the add to cart button")
    public void iClickOnTheAddToCartButton() {
        System.out.println("Inside Step - I click on the add to cart button");
    }

    @And("I go to the shopping cart page")
    public void iGoToTheShoppingCartPage() {
        System.out.println("Inside Step - I go to the shopping cart page");
    }

    @Then("I should see the checkout button")
    public void iShouldSeeTheCheckoutButton() {
        System.out.println("Inside Step - I should see the checkout button");
    }

    @Given("I am logged in to my account")
    public void iAmLoggedInToMyAccount() {
        System.out.println("Inside Step - I am logged in to my account");
    }

    @When("I add a product to my wishlist")
    public void iAddAProductToMyWishlist() {
        System.out.println("Inside Step - I add a product to my wishlist");
    }

    @And("I go to the wishlist page")
    public void iGoToTheWishlistPage() {
        System.out.println("Inside Step - I go to the wishlist page");
    }

    @Then("I should see the product in the wishlist")
    public void iShouldSeeTheProductInTheWishlist() {
        System.out.println("Inside Step - I should see the product in the wishlist");
    }

    @Given("I search for a product")
    public void iSearchForAProduct() {
        System.out.println("Inside Step - I search for a product");
    }

    @When("I add the product to the cart from search results")
    public void iAddTheProductToTheCartFromSearchResults() {
        System.out.println("Inside Step - I add the product to the cart from search results");
    }

    @When("I view the product details")
    public void iViewTheProductDetails() {
        System.out.println("Inside Step - I view the product details");
    }

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        System.out.println("Inside Step - I am on the homepage");
    }

    @When("I scroll to the featured section")
    public void iScrollToTheFeaturedSection() {
        System.out.println("Inside Step - I scroll to the featured section");
    }

    @When("I compare the product")
    public void iCompareTheProduct() {
        System.out.println("Inside Step - I compare the product");
    }

    @And("I add the product to the cart from the comparison page")
    public void iAddTheProductToTheCartFromTheComparisonPage() {
        System.out.println("Inside Step - I add the product to the cart from the comparison page");
    }
}
