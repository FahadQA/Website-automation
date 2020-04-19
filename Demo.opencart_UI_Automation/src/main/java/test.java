import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class test {
	WebDriver driver;
	
	public test(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By ProvideEmailXpath = By.xpath("//INPUT[@id='SearchEmail']");
	By FirstnameXpath = By.xpath("//INPUT[@id='SearchFirstName']");
	By LastnameXpath = By.xpath("//INPUT[@id='SearchFirstName']");
	By SearchCustomersXpath = By.xpath("//BUTTON[@id='search-customers']");
	By EmailTextBoxXpath = By.xpath("//INPUT[@id='Email']");
	By PasswordTextBoxXpath = By.xpath("//INPUT[@id='Password']");
	By SubmitButtonXpath = By.xpath("//INPUT[@class='button-1 login-button']");
	By menuCustomerXpath = By.xpath("(//A[@href='#'])[6]");
	By itemCustomerXpath = By.xpath("//SPAN[@class='menu-item-title'][text()='Customers']");
	
	By Table = By.xpath("//table[@id='customers-grid']/tbody/tr");
	
	
	
	
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
    
	
	public void SetEmail(String email) 
	{   
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(ProvideEmailXpath).sendKeys(email);
	}
	
	public void FirstName(String Firstname)
	{
		driver.findElement(FirstnameXpath).sendKeys(Firstname);
	}
	
	public void LastName(String Lastname)
	{
		driver.findElement(LastnameXpath).sendKeys(Lastname);
	}
	
	
    

	
	public void ClickSubmitButton()
	{
		driver.findElement(SearchCustomersXpath).click();
	}
	
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}

	public void clickMenuCustomer()
	{
		driver.findElement(menuCustomerXpath).click();
	}
	
	public void clickItemCustomer()
	{
		driver.findElement(itemCustomerXpath).click();
	}

	public void provideEmail(String email)
	{
		//driver.findElement(ProvideEmailXpath).clear();
		driver.findElement(ProvideEmailXpath).sendKeys(email);
		//System.out.println("email is  given");
		
	}
}
