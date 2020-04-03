package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class pageObject {
	
	WebDriver driver;
	
	public pageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By EmailTextBoxXpath = By.xpath("//INPUT[@id='input-email']");
	By PasswordTextBoxXpath = By.xpath("//INPUT[@id='input-password']");
	By SubmitButtonXpath = By.xpath("//INPUT[@type='submit']");
	By UserAccountIdentityXpath = By.xpath("(//H2[text()='My Account'])[1]");

	
	public void enterEmail(String email)
	{
		driver.findElement(EmailTextBoxXpath).clear();
		driver.findElement(EmailTextBoxXpath).sendKeys(email);
		//System.out.println("email is  given");
		
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(PasswordTextBoxXpath).clear();
		driver.findElement(PasswordTextBoxXpath).sendKeys(password);
		//System.out.println("password is given");
	}
	
	public void clickSubmitButton()
	{
		driver.findElement(SubmitButtonXpath).click();
		//System.out.println("submit button is clicked");
	}
	
	public String UserAccountIdentity() {
		// TODO Auto-generated method stub
		String message = driver.findElement(UserAccountIdentityXpath).getText();
		return message;
		
		
	}
	
}
