package registrationAndLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver driver;
	
	public HomePage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//SPAN[@class='caret']")
	WebElement clickMyAccount;
	
	@FindBy(xpath="//A[@href='https://demo.opencart.com/index.php?route=account/register'][text()='Register']")
	WebElement clickRegistration;
	
	@FindBy(xpath="(//A[@href='https://demo.opencart.com/index.php?route=account/login'][text()='Login'][text()='Login'])[1]")
	WebElement clickLogIn;
	
	public void HomepageToRegistration()
	{
		clickMyAccount.click();
		clickRegistration.click();
	}
	
	public void HomepageToLogIn()
	{
		clickMyAccount.click();
		clickLogIn.click();
	}

}
