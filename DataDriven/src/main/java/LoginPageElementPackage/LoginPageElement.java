package LoginPageElementPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElement {
	
	WebDriver driver;
	
	public LoginPageElement(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By MyaccountXpath = By.xpath("(//A[@href='https://demo.opencart.com/index.php?route=account/account'])[1]");
	By LoginButtonXpath = By.xpath("//A[@href='https://demo.opencart.com/index.php?route=account/login'][text()='Login']");
	By EmailTextBoxXpath = By.xpath("//INPUT[@id='input-email']");
	By PasswordTextBoxXpath = By.xpath("//INPUT[@id='input-password']");
	By SubmitButtonXpath = By.xpath("//INPUT[@type='submit']");
	By UserAccountIdentityXpath = By.xpath("(//H2[text()='My Account'])[1]"); 
	By IDorPasswordIsWrongXpath = By.xpath("//DIV[@class='alert alert-danger alert-dismissible']"); 
	By LogoutButtonXpath = By.xpath("//A[@href='https://demo.opencart.com/index.php?route=account/logout'][text()='Logout']");
	
	
	
	
	public void clickMyaccount()
	{
		driver.findElement(MyaccountXpath).click();
		System.out.println("my account button is clicked");
	}
	

	public void clickLoginButton() 
	{
		driver.findElement(LoginButtonXpath).click();
		System.out.println("login button is clicked");
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(EmailTextBoxXpath).clear();
		driver.findElement(EmailTextBoxXpath).sendKeys(email);
		System.out.println("email is  given");
		
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(PasswordTextBoxXpath).clear();
		driver.findElement(PasswordTextBoxXpath).sendKeys(password);
		System.out.println("password is given");
	}
	
	public void clickSubmitButton()
	{
		driver.findElement(SubmitButtonXpath).click();
		System.out.println("submit button is clicked");
	}
	
	public String UserAccountIdentity()
	{
		String UserAccountIdentity = driver.findElement(UserAccountIdentityXpath).getText();
		return UserAccountIdentity;
		
	}
	
	public void clickLogoutButton()
	{
		driver.findElement(LogoutButtonXpath).click();
		System.out.println("logout button is clicked");
	}
	



	public String IDorPasswordIsWrong() {
		// TODO Auto-generated method stub
		String IDorPasswordIsWrong = driver.findElement(IDorPasswordIsWrongXpath).getText();
		return IDorPasswordIsWrong;
		
		
	}
	
	
	

}
