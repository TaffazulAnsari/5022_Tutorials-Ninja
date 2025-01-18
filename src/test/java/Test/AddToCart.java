package Test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.tutorialninja.genericutility.Base;
import com.tutorialninja.pomrepository.CartPage;
import com.tutorialninja.pomrepository.MainPage;
import com.tutorialninja.pomrepository.ProductComparisonPage;

public class AddToCart extends Base{
	
	//AddProductToCartFromProductPage
	@Test
	public void AddProductToCartFromProductPage() throws IOException, InterruptedException
	{
		WebUtils.implicitWait(driver);
		MainPage mp= new MainPage(driver);
		CartPage cp = new CartPage(driver);
		Actions ac = new Actions(driver);
		ac.scrollToElement(cp.getProduct()).perform();
		//Thread.sleep(5000);
		cp.getProduct().click();
		//Thread.sleep(5000);
		mp.getAddtocartbutton().click();
		//Thread.sleep(2000);
		mp.getShoppingcartlink().click();
		assertTrue(cp.getcheckout().isDisplayed());
		
		
	}
	
	//AddProductToCartFromWishlist
	@Test
	public void AddProductToCartFromWishlist() throws IOException, InterruptedException
	{
		LoginToAccount();
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("iPhone");
		mp.getSearchbutton().click();
		CartPage cp = new CartPage(driver);
		Actions ac = new Actions(driver);
		ac.scrollToElement(cp.getProduct()).perform();
		cp.getProduct().click();
		cp.getWishlist().click();
		cp.getWishlistlink().click();
		Thread.sleep(4000);
		assertTrue(cp.getWishlistproduct().isDisplayed());
		
	}
	
	
	//AddProductFromSearchResultPage
	@Test
	public void AddProductFromSearchResultPage() throws IOException, InterruptedException
	{
		WebUtils.implicitWait(driver);
		MainPage mp  = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("iPhone");
		mp.getSearchbutton().click();
		CartPage cp = new CartPage(driver);
		mp.getAddtocartsearchpage().click();
		Thread.sleep(2000);
		mp.getShoppingcartlink().click();
		Thread.sleep(5000);
		assertTrue(cp.getcheckout().isDisplayed());
	}
	
	//AddProductFromProductDisplayPage
	@Test
	public void AddProductFromProductDisplayPage() throws IOException, InterruptedException
	{
		WebUtils.implicitWait(driver);
		MainPage mp  = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("iPhone");
		mp.getSearchbutton().click();
		Thread.sleep(3000);
		CartPage cp = new CartPage(driver);
		mp.getAddtocartbutton().click();
		Thread.sleep(5000);
		mp.getShoppingcartlink().click();
		assertTrue(cp.getcheckout().isDisplayed());
		
	}
	
	//AddToCartFromFeaturesSection
	@Test
	public void AddToCartFromFeaturesSection()
	{
		WebUtils.implicitWait(driver);
		MainPage mp= new MainPage(driver);
		CartPage cp = new CartPage(driver);
		Actions ac = new Actions(driver);
		ac.scrollToElement(cp.getProduct()).perform();
		cp.getProduct().click();
		mp.getAddtocartbutton().click();
		mp.getShoppingcartlink().click();
		assertTrue(cp.getcheckout().isDisplayed());
	}
	
	//AddToCartFromProductComparisionPage
	@Test
	public void AddToCartFromProductComparisionPage() throws IOException, InterruptedException
	{
		WebUtils.implicitWait(driver);
		MainPage mp=new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("iPhone");
		mp.getSearchbutton().click();
		Thread.sleep(3000);
		mp.getCompareproductbutton().click();
		Thread.sleep(3000);
		ProductComparisonPage pg= new ProductComparisonPage(driver);
		Actions ac = new Actions(driver);
		ac.scrollToElement(pg.getProductcomparisonlink()).perform();
		pg.getProductcomparisonlink().click();
		Thread.sleep(3000);
		ac.scrollToElement(pg.getAddtocartbutton()).perform();
		pg.getAddtocartbutton().click();
		mp.getShoppingcartlink().click();
		CartPage cp = new CartPage(driver);
		assertTrue(cp.getCheckout().isDisplayed());
		
		
	}
	
}
