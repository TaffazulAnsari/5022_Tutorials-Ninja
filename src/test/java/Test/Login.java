package Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.tutorialninja.genericutility.Base;
import com.tutorialninja.pomrepository.HomePage;
import com.tutorialninja.pomrepository.LogInPage;

public class Login extends Base {

	//LoggingInWithValidDetails
	@Test(priority = 1)   

	public void LoggingInWithValidDetails() throws IOException, InterruptedException {
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys("Taffazul123");
		login.getLoginbtn().click();
		Thread.sleep(2000);
		assertEquals(login.getEditYourAccountLinkText().getText(), FileUtils.readCommonData("accountcreated"));
	}
	
	//LoggingInWithInvalidDetails
	@Test(priority = 2)
	public void LoggingInWithInvalidDetails() throws IOException, InterruptedException {
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys("55454n79*&n5gmail.com");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys("njjv555555555");
		login.getLoginbtn().click();
		Thread.sleep(2000);
		assertEquals(login.getWarningmessage().getText(), FileUtils.readCommonData("warningmessage"));

	}
	//LoggingInWithInvalidEmailValidPassword
	@Test(priority = 3)
	public void LoggingInWithInvalidEmailValidPassword() throws IOException, InterruptedException {
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys("@fshe53sftaffazulgmail.com");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys("Taffazul123");
		login.getLoginbtn().click();
		Thread.sleep(2000);
		assertEquals(login.getWarningmessage().getText(), FileUtils.readCommonData("warningmessage"));

	}
	
	//LoginWithValidEmailInvalidPassword
	@Test(priority = 4)
	public void LoginWithValidEmailInvalidPassword() throws IOException, InterruptedException
	{
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys("fkkkkkk555555555");
		login.getLoginbtn().click();
		Thread.sleep(2000);
		assertEquals(login.getWarningmessage().getText(), FileUtils.readCommonData("warningmessage"));

	}
	
	//LoginWithoutProvidingAnyCredentials
	@Test(priority = 5)
	public void LoginWithoutProvidingAnyCredentials() throws IOException, InterruptedException 
	{
		WebUtils.implicitWait(driver);
		HomePage homepage = new HomePage(driver);
		homepage.getMyaccountdropdown().click();
		homepage.getLogin().click();
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys("");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys("");
		login.getLoginbtn().click();
		Thread.sleep(2000);
		assertEquals(login.getWarningmessage().getText(), FileUtils.readCommonData("warningmessage"));
		
	}
	
	//VerifyForgottenPasswordLink
	@Test(priority = 6)
	public void VerifyForgottenPasswordLink() throws IOException, InterruptedException
	{
		ClickonLogin(driver);
		LogInPage login = new LogInPage(driver);
		login.getForgottenpassword().click();
		Thread.sleep(2000);
		assertEquals(login.getForgottenpasswordpage().getText(),FileUtils.readCommonData("forgottenpagepage"));
		
	}
	
	//LoginUsingKeyboardTab
	@Test(priority = 7)
	public void LoginUsingKeyboardTab() throws IOException, InterruptedException
	{
		ClickonLogin(driver);
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys(("Taffazulansari7979@gmail.com")+Keys.TAB);
		login.getPasswordfield().sendKeys(("Taffazul123")+Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	//LoginAndNavigatingBack
	@Test(priority = 8)
	public void LoginAndNavigatingBack() throws IOException, InterruptedException
	{
		ClickonLogin(driver);
		LogInPage login = new LogInPage(driver);
		login.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		login.getPasswordfield().click();
		login.getPasswordfield().sendKeys("Taffazul123");
		login.getLoginbtn().submit();
		driver.navigate().back();
		Thread.sleep(2000);
		assertTrue(login.getLoginpageverify().isDisplayed());
		}
}
