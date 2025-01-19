package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {

    @Given("I am logged in to my account")
    public void iAmLoggedInToMyAccount() {
        System.out.println("Inside Step - I am logged in to my account");
    }

    @When("I click on the \"My Account\" dropdown")
    public void iClickOnTheMyAccountDropdown() {
        System.out.println("Inside Step - I click on the \"My Account\" dropdown");
    }

    @And("I select the logout option")
    public void iSelectTheLogoutOption() {
        System.out.println("Inside Step - I select the logout option");
    }

    @Then("I should see a confirmation that I have logged out")
    public void iShouldSeeAConfirmationThatIHaveLoggedOut() {
        System.out.println("Inside Step - I should see a confirmation that I have logged out");
    }

    @When("I click on the logout option in the right bottom corner")
    public void iClickOnTheLogoutOptionInTheRightBottomCorner() {
        System.out.println("Inside Step - I click on the logout option in the right bottom corner");
    }
}
