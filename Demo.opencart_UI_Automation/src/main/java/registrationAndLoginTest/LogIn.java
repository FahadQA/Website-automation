package registrationAndLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	WebDriver driver;
	
	public LogIn(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//INPUT[@id='input-email']")
	WebElement Email;

	@FindBy(xpath="//INPUT[@id='input-password']")
	WebElement Password;
	
	@FindBy(xpath="//DIV[@class='alert alert-danger alert-dismissible']")
	WebElement InvalidEmailAlert;
	
	@FindBy(xpath="//DIV[@class='alert alert-danger alert-dismissible']")
	WebElement InvalidPasswordAlert;
	
	@FindBy(xpath="//INPUT[@type='submit']")
	WebElement loginButton;
	
	
	public void provideEmail(String email)
	{
		Email.sendKeys(email);
	} 

	public void providePassword(String password)
	{
		Password.sendKeys(password);
	} 

	public void clickLoginButton()
	{
		loginButton.click();
	} 
	
	
	
	
	
	
}


