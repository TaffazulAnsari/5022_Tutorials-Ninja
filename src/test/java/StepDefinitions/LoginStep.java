package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    @Given("Login with valid credentials")
    public void loginWithValidCredentials() {
        System.out.println("Inside Step - Login with valid credentials");
    }

    @When("I enter valid email and password")
    public void iEnterValidEmailAndPassword() {
        System.out.println("Inside Step - I enter valid email and password");
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        System.out.println("Inside Step - I click on the login button");
    }

    @Then("I should see the \"Edit your account information\" link")
    public void iShouldSeeTheEditYourAccountInformationLink() {
        System.out.println("Inside Step - I should see the \"Edit your account information\" link");
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        System.out.println("Inside Step - I am on the login page");
    }

    @When("I enter invalid email and password")
    public void iEnterInvalidEmailAndPassword() {
        System.out.println("Inside Step - I enter invalid email and password");
    }

    @Then("I should see a warning message")
    public void iShouldSeeAWarningMessage() {
        System.out.println("Inside Step - I should see a warning message");
    }

    @When("I leave email and password fields empty")
    public void iLeaveEmailAndPasswordFieldsEmpty() {
        System.out.println("Inside Step - I leave email and password fields empty");
    }
}
