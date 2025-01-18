package Test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Checkout;
import com.tutorialninja.genericutility.Base;

public class CheckoutTest extends Base {

    WebDriver driver;
    Checkout checkout;

    public WebDriver initializeDriver() {
        // Example for Chrome WebDriver setup
        System.setProperty("webdriver.chrome.driver", "path_to_chrome_driver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @Test(priority = 1)
    public void verifyCheckoutButton() {
        checkout = new Checkout(driver);
        checkout.getCheckoutButton().click();
        assertTrue(checkout.getBillingAddressContinueButton().isDisplayed(), "Checkout process did not start as expected.");
    }

    @Test(priority = 2)
    public void verifyBillingAddressContinueButton() {
        checkout = new Checkout(driver);
        checkout.continueToBillingAddress();
        assertTrue(checkout.getDeliveryAddressContinueButton().isDisplayed(), "Billing address step did not continue.");
    }

    @Test(priority = 3)
    public void verifyDeliveryAddressContinueButton() {
        checkout = new Checkout(driver);
        checkout.continueToDeliveryAddress();
        assertTrue(checkout.getDeliveryMethodContinueButton().isDisplayed(), "Delivery address step did not continue.");
    }

    @Test(priority = 4)
    public void verifyDeliveryMethodContinueButton() {
        checkout = new Checkout(driver);
        checkout.continueToDeliveryMethod();
        assertTrue(checkout.getPaymentMethodContinueButton().isDisplayed(), "Delivery method step did not continue.");
    }

    @Test(priority = 5)
    public void verifyPaymentMethodContinueButton() {
        checkout = new Checkout(driver);
        checkout.continueToPaymentMethod();
        assertTrue(checkout.getConfirmOrderButton().isDisplayed(), "Payment method step did not continue.");
    }

    @Test(priority = 6)
    public void verifyConfirmOrderButton() {
        checkout = new Checkout(driver);
        checkout.confirmOrder();
        assertTrue(checkout.getOrderConfirmationMessage().isDisplayed(), "Order was not confirmed as expected.");
    }
}
