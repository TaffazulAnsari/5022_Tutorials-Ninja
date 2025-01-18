package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

    WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//input[@id='button-payment-address']")
    private WebElement billingAddressContinueButton;

    @FindBy(xpath = "//input[@id='button-shipping-address']")
    private WebElement deliveryAddressContinueButton;

    @FindBy(xpath = "//input[@id='button-shipping-method']")
    private WebElement deliveryMethodContinueButton;

    @FindBy(xpath = "//input[@id='button-payment-method']")
    private WebElement paymentMethodContinueButton;

    @FindBy(xpath = "//input[@id='button-confirm']")
    private WebElement confirmOrderButton;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Your order has been placed!']")
    private WebElement orderConfirmationMessage;

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getBillingAddressContinueButton() {
        return billingAddressContinueButton;
    }

    public WebElement getDeliveryAddressContinueButton() {
        return deliveryAddressContinueButton;
    }

    public WebElement getDeliveryMethodContinueButton() {
        return deliveryMethodContinueButton;
    }

    public WebElement getPaymentMethodContinueButton() {
        return paymentMethodContinueButton;
    }

    public WebElement getConfirmOrderButton() {
        return confirmOrderButton;
    }

    public WebElement getOrderConfirmationMessage() {
        return orderConfirmationMessage;
    }

    // Methods for each step
    public void continueToBillingAddress() {
        billingAddressContinueButton.click();
    }

    public void continueToDeliveryAddress() {
        deliveryAddressContinueButton.click();
    }

    public void continueToDeliveryMethod() {
        deliveryMethodContinueButton.click();
    }

    public void continueToPaymentMethod() {
        paymentMethodContinueButton.click();
    }

    public void confirmOrder() {
        confirmOrderButton.click();
    }
}
