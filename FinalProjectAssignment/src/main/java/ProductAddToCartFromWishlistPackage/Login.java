package ProductAddToCartFromWishlistPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

WebDriver driver;
	
	public Login (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//INPUT[@id='input-email']")
	WebElement typeEmail;
	
	@FindBy(xpath="//INPUT[@id='input-password']")
	WebElement typePassword;
	
	@FindBy(xpath="//INPUT[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//DIV[@class='alert alert-danger alert-dismissible']")
	WebElement invalidEmail;
	
	@FindBy(xpath="//DIV[@class='alert alert-danger alert-dismissible']")
	WebElement invalidPassword;
	
	public void provideEmail(String email)
	{
		typeEmail.sendKeys(email);
	} 
	
	public void providePassword(String Password)
	{
		typePassword.sendKeys(Password);
	} 
	
	public void clickLoginButton()
	{
		loginButton.click();
	} 
	
	public void invalidEmailMessage()
	{
		String expecteInvalidEmaildMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualInvalidEmaildMessage = invalidEmail.getText();
		
		assertEquals(expecteInvalidEmaildMessage, actualInvalidEmaildMessage);
		
		System.out.println("cannot login due to: "+ invalidEmail.getText());
	}
	
	public void invalidPasswordMessage()
	{
		String expecteinvalidPasswordMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualinvalidPasswordMessage = invalidEmail.getText();
		
		assertEquals(expecteinvalidPasswordMessage, actualinvalidPasswordMessage);
		
		System.out.println("cannot login due to: "+ invalidPassword.getText());
	}
	
	
}
