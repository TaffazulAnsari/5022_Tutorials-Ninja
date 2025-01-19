package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistersStep {

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        System.out.println("Inside Step - I am on the registration page");
    }

    @When("I enter valid registration details")
    public void iEnterValidRegistrationDetails() {
        System.out.println("Inside Step - I enter valid registration details");
    }

    @When("I enter registration details with an existing email")
    public void iEnterRegistrationDetailsWithAnExistingEmail() {
        System.out.println("Inside Step - I enter registration details with an existing email");
    }

    @When("I enter valid registration details without agreeing to the privacy policy")
    public void iEnterValidRegistrationDetailsWithoutAgreeingToThePrivacyPolicy() {
        System.out.println("Inside Step - I enter valid registration details without agreeing to the privacy policy");
    }

    @When("I enter passwords that do not match")
    public void iEnterPasswordsThatDoNotMatch() {
        System.out.println("Inside Step - I enter passwords that do not match");
    }

    @And("I click on the continue button")
    public void iClickOnTheContinueButton() {
        System.out.println("Inside Step - I click on the continue button");
    }

    @Then("I should see the registration success message")
    public void iShouldSeeTheRegistrationSuccessMessage() {
        System.out.println("Inside Step - I should see the registration success message");
    }

    @Then("I should see the existing email warning message")
    public void iShouldSeeTheExistingEmailWarningMessage() {
        System.out.println("Inside Step - I should see the existing email warning message");
    }

    @Then("I should see the privacy policy warning message")
    public void iShouldSeeThePrivacyPolicyWarningMessage() {
        System.out.println("Inside Step - I should see the privacy policy warning message");
    }

    @Then("I should see the password mismatch warning message")
    public void iShouldSeeThePasswordMismatchWarningMessage() {
        System.out.println("Inside Step - I should see the password mismatch warning message");
    }
}
