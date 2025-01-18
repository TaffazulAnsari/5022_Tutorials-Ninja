package Test;


import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.annotations.Test;
import com.tutorialninja.genericutility.Base;
import com.tutorialninja.pomrepository.RegisterPage;

public class Register extends Base {
	
	//RegisterByProvidingValidCredentials
	@Test(priority = 1)
	public void RegisterByProvidingValidCredentials() throws IOException, InterruptedException {
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();

		registerpage.getFirstnamefield().sendKeys("Taffazul");
		registerpage.getLastnamefield().click();

		registerpage.getLastnamefield().sendKeys("Ansari");
		registerpage.getEmailfield().click();

		registerpage.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		registerpage.getPasswordfield().click();

		registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys("7979047741");
		registerpage.getPasswordfield().sendKeys("Taffazul123");
		registerpage.getPasswordconfirmfield().click();

		registerpage.getPasswordconfirmfield().sendKeys("Taffazul123");
		registerpage.getPrivacyCheckbox().click();

		registerpage.getContinuebutton().click();

		assertTrue(registerpage.getRegistrationsuccess().isDisplayed());

	}
	
	//RegistrationByProvidingExistingEmail
	@Test
	public void RegistrationByProvidingExistingEmail() throws IOException,InterruptedException {
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys("Taffazul");
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys("Ansari");
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		registerpage.getPasswordfield().click();
        registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys("7979047741");
		registerpage.getPasswordfield().sendKeys("Taffazul123");
		
		Thread.sleep(3000);
		
	    registerpage.getPasswordconfirmfield().click();
		registerpage.getPasswordconfirmfield().sendKeys("Taffazul123");
		registerpage.getPrivacyCheckbox().click();
		registerpage.getContinuebutton().click();
		assertTrue(registerpage.getExistingemailwarning().isDisplayed());
	}
	
	//RegistrationByWithoutSelectingPrivacyCheckBox
	@Test
	public void RegistrationByWithoutSelectingPrivacyCheckBox()
	{
		ClickOnRegister();
		
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys("Taffazul");
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys("Ansari");
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		registerpage.getPasswordfield().click();
        registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys("7979047741");
		registerpage.getPasswordfield().sendKeys("Taffazul123");
	    registerpage.getPasswordconfirmfield().click();
		registerpage.getPasswordconfirmfield().sendKeys("Taffazul123");
		registerpage.getContinuebutton().click();
		assertTrue(registerpage.getPrivacywarning().isDisplayed());
			
	}
	
	//RegistrationByProvidingAllFields
	@Test
	public void RegistrationByProvidingAllFields()
	{
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys("Taffazul");
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys("Ansari");
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys("7979047741");
		registerpage.getPasswordfield().click();
		registerpage.getPasswordfield().sendKeys("Taffazul123");
	    registerpage.getPasswordconfirmfield().click();
		registerpage.getPasswordconfirmfield().sendKeys("Taffazul123");
		registerpage.getSubscribeYesRadio().click();
		registerpage.getPrivacyCheckbox().click();
		registerpage.getContinuebutton().submit();
		assertTrue(registerpage.getRegistrationsuccess().isDisplayed());
		
	}
	
	//RegistrationByProvidingDifferentPasswords
	@Test
	public void RegistrationByProvidingDifferentPasswords() throws IOException
	{
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys("Taffazul");
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys("Ansari");
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys("7979047741");
		registerpage.getPasswordfield().click();
		registerpage.getPasswordfield().sendKeys("Taffazul123");
	    registerpage.getPasswordconfirmfield().click();
		registerpage.getPasswordconfirmfield().sendKeys("Taffazul123");
		registerpage.getPrivacyCheckbox().click();
		registerpage.getContinuebutton().submit();
		assertTrue(registerpage.getPasswordwarning().isDisplayed());
		
	}
	
	
	//RegistrationByNotprovidingConfirmPassword
	@Test
	public void RegistrationByNotprovidingConfirmPassword() throws IOException
	{
		ClickOnRegister();
		RegisterPage registerpage = new RegisterPage(driver);
		registerpage.getFirstnamefield().click();
		registerpage.getFirstnamefield().sendKeys("Taffazul");
		registerpage.getLastnamefield().click();
		registerpage.getLastnamefield().sendKeys("Ansari");
		registerpage.getEmailfield().click();
		registerpage.getEmailfield().sendKeys("Taffazulansari7979@gmail.com");
		registerpage.getTelephonefield().click();
		registerpage.getTelephonefield().sendKeys("7979047741");
		registerpage.getPasswordfield().click();
		registerpage.getPasswordfield().sendKeys("Taffazul@123");
		registerpage.getPrivacyCheckbox().click();
		registerpage.getContinuebutton().submit();
		assertTrue(registerpage.getPasswordconfirmwarning().getText().equalsIgnoreCase(FileUtils.readCommonData("passwordconfirmwarning")));
	}

}
