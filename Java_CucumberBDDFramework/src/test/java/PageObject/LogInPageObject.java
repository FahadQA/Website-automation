package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LogInPageObject {
	
	WebDriver driver;
	
	public LogInPageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By EmailTextBoxXpath = By.xpath("//INPUT[@id='Email']");
	By PasswordTextBoxXpath = By.xpath("//INPUT[@id='Password']");
	By SubmitButtonXpath = By.xpath("//INPUT[@class='button-1 login-button']");
	By UserAccountIdentityXpath = By.xpath("(//H1[text()='Dashboard'])[1]");   

	
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
		
		String message = driver.getTitle();
		return message;
		
		
	}
	
}
