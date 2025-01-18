package Test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import com.tutorialninja.genericutility.Base;
import com.tutorialninja.pomrepository.HomePage;
import com.tutorialninja.pomrepository.LogInPage;
import com.tutorialninja.pomrepository.MainPage;

public class Search extends Base{
	
	//SearchWithExisitingProductName
	@Test
	public void SearchWithExisitingProductName() throws IOException, InterruptedException
	{
		
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("iPhone");
		mp.getSearchbutton().click();
		assertTrue(mp.getIphone().isDisplayed());
		
	}
	
	//SearchWithNonExistingProductName
	@Test
	public void SearchWithNonExistingProductName() throws IOException
	{
		
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("sjsal");
		mp.getSearchbutton().click();
		assertTrue(mp.getProductnotfound().isDisplayed());
		
		
	}
	
	//SearchWithoutAnyProductName
	@Test
	public void SearchWithoutAnyProductName()
	{
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("");
		mp.getSearchbutton().click();
		assertTrue(mp.getProductnotfound().isDisplayed());
		
	}
	
	//SearchWithValidProductAfterLogin
	@Test
	
	public void SearchWithValidProductAfterLogin() throws IOException
	{
		LoginToAccount();
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("Iphone");
		mp.getSearchbutton().click();
		assertTrue(mp.getIphone().isDisplayed());
		
	}
	//SearchWithMultiplecriteriaProduct
	@Test
	public void SearchWithMultiplecriteriaProduct() throws IOException
	{
		LoginToAccount();
		MainPage mp = new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("iPhone MacBook");
		mp.getSearchbutton().click();
		assertTrue(mp.getProductsfound().isDisplayed());
	}
	
	//VerifySearchPlaceHolder
	@Test
	public void VerifySearchPlaceHolder() throws IOException
	{
		MainPage mp = new MainPage(driver);
		assertTrue(mp.getSearchbox().getDomProperty("placeholder").equals("placeholdersearchbox"));
		
	}
	
	//VerifyUsingSearchcriteriaField
	@Test
	public void VerifyUsingSearchcriteriaField() throws IOException
	{
		MainPage mp = new MainPage(driver);
		mp.getSearchbutton().click();
		mp.getSearchcriteria().click();
		mp.getSearchcriteria().sendKeys("Iphone");
		mp.getSearchcriteriabutton().click();
		assertTrue(mp.getIphone().isDisplayed());
		
	}
	
	//VerifySearchcriteriaUSingProductDescription
	@Test
	public void VerifySearchcriteriaUSingProductDescription() throws IOException
	{
		MainPage mp = new MainPage(driver);
		mp.getSearchbutton().click();
		mp.getSearchcriteria().click();
		mp.getSearchcriteria().sendKeys("iPhone is a revolutionary new mobile phone that allows you to make a call by simply tapping a name or number in your address book, a favorites list, or a call log. It also automatically syncs all your contacts from a PC, Mac, or Internet service. And it lets you select and listen to voicemail messages in whatever order you want just like email");
		mp.getSearchcriteriabutton().click();
		assertTrue(mp.getIphone().isDisplayed());
	}
	
	//VerifySearchCriteriaBySelectingCategory
	@Test
	public void VerifySearchCriteriaBySelectingCategory() throws IOException, InterruptedException
	{	WebUtils.implicitWait(driver);
	MainPage mp = new MainPage(driver);
	mp.getSearchbutton().click();
	mp.getSearchcriteria().sendKeys(FileUtils.readCommonData("searchproduct"));
	Select category = new Select(mp.getCategorydropdown());
	mp.getCategorydropdown().click();
	category.selectByValue("24");
	mp.getSearchcriteriabutton().click();
	assertTrue(mp.getIphone().isDisplayed());
}
	
	//VerifySearchCriteriaBySubCategories
	@Test
	public void VerifySearchCriteriaBySubCategories() throws IOException
	{
		WebUtils.implicitWait(driver);
		MainPage mp = new MainPage(driver);
		mp.getSearchbutton().click();
		mp.getSearchcriteria().click();
		mp.getSearchcriteria().sendKeys(FileUtils.readCommonData("multipleproduct"));
		mp.getCategorydropdown().click();
		Select category = new Select(mp.getCategorydropdown());
		mp.getCategorydropdown().click();
		category.selectByValue("20");
		mp.getSubcategorycheckbox().click();
		mp.getSearchcriteriabutton().click();
		assertTrue(mp.getProductsfound().isDisplayed());
		
	}
	
	//VerifyProductCompareLink
	@Test
	public void VerifyProductCompareLink() throws IOException
	{
		MainPage mp=new MainPage(driver);
		mp.getSearchbox().click();
		mp.getSearchbox().sendKeys("iPhone");
		mp.getSearchbutton().click();
		mp.getProductcomparelink().click();
		assertTrue(mp.getProductcomparepage().isDisplayed());
	}

}

