package Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.tutorialninja.genericutility.Base;
import POM.MainPage;

public class Main extends Base {

    @Test(priority = 1)
    public void verifySearchFunctionality() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getSearchbox().sendKeys("MacBook");
        mainPage.getSearchbutton().click();
        assertTrue(mainPage.getProductsfound().isDisplayed(), "Expected products are not found.");
    }

    @Test(priority = 2)
    public void verifyNoProductsFoundMessage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getSearchbox().sendKeys("NonExistingProduct");
        mainPage.getSearchbutton().click();
        assertTrue(mainPage.getProductnotfound().isDisplayed(), "No product found message is not displayed.");
    }

    @Test(priority = 3)
    public void verifyAdvancedSearchCriteria() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.getSearchcriteria().sendKeys("Laptop");
        //Thread.sleep(5000);
        mainPage.getCategorydropdown().sendKeys("Laptops & Notebooks");
        mainPage.getSubcategorycheckbox().click();
        mainPage.getSearchcriteriabutton().click();
        assertTrue(mainPage.getProductsfound().isDisplayed(), "Advanced search did not return expected results.");
    }

    @Test(priority = 4)
    public void verifyCompareProductButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getCompareproductbutton().click();
        assertTrue(mainPage.getProductcomparelink().isDisplayed(), "Product comparison link is not displayed after clicking compare.");
    }

    @Test(priority = 5)
    public void verifyProductComparisonPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getProductcomparelink().click();
        assertTrue(mainPage.getProductcomparepage().isDisplayed(), "Product comparison page is not displayed.");
    }

    @Test(priority = 6)
    public void verifyAddToCartFromProductPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getAddtocartbutton().click();
        assertTrue(mainPage.getShoppingcartlink().isDisplayed(), "Shopping cart link is not displayed after adding to cart.");
    }

    @Test(priority = 7)
    public void verifyAddToCartFromSearchResults() {
        MainPage mainPage = new MainPage(driver);
        mainPage.getSearchbox().sendKeys("MacBook");
        mainPage.getSearchbutton().click();
        mainPage.getAddtocartsearchpage().click();
        assertTrue(mainPage.getShoppingcartlink().isDisplayed(), "Shopping cart link is not displayed after adding to cart from search results.");
    }
}
