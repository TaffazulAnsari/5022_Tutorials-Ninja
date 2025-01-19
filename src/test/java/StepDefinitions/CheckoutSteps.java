package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

    @When("I click on the checkout button")
    public void iClickOnTheCheckoutButton() {
        System.out.println("Inside Step - I click on the checkout button");
    }

    @Then("I should see the billing address continue button")
    public void iShouldSeeTheBillingAddressContinueButton() {
        System.out.println("Inside Step - I should see the billing address continue button");
    }

    @When("I continue to the billing address")
    public void iContinueToTheBillingAddress() {
        System.out.println("Inside Step - I continue to the billing address");
    }

    @Then("I should see the delivery address continue button")
    public void iShouldSeeTheDeliveryAddressContinueButton() {
        System.out.println("Inside Step - I should see the delivery address continue button");
    }

    @When("I continue to the delivery address")
    public void iContinueToTheDeliveryAddress() {
        System.out.println("Inside Step - I continue to the delivery address");
    }

    @Then("I should see the delivery method continue button")
    public void iShouldSeeTheDeliveryMethodContinueButton() {
        System.out.println("Inside Step - I should see the delivery method continue button");
    }

    @When("I continue to the delivery method")
    public void iContinueToTheDeliveryMethod() {
        System.out.println("Inside Step - I continue to the delivery method");
    }

    @Then("I should see the payment method continue button")
    public void iShouldSeeThePaymentMethodContinueButton() {
        System.out.println("Inside Step - I should see the payment method continue button");
    }

    @When("I continue to the payment method")
    public void iContinueToThePaymentMethod() {
        System.out.println("Inside Step - I continue to the payment method");
    }

    @Then("I should see the confirm order button")
    public void iShouldSeeTheConfirmOrderButton() {
        System.out.println("Inside Step - I should see the confirm order button");
    }

    @When("I confirm the order")
    public void iConfirmTheOrder() {
        System.out.println("Inside Step - I confirm the order");
    }

    @Then("I should see the order confirmation message")
    public void iShouldSeeTheOrderConfirmationMessage() {
        System.out.println("Inside Step - I should see the order confirmation message");
    }
}
