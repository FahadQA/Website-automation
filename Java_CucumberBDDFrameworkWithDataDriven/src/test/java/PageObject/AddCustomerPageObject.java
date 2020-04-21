package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPageObject {
	
	WebDriver driver;
	
	public AddCustomerPageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
			
	By menuCustomerXpath = By.xpath("(//A[@href='#'])[6]");
	By itemCustomerXpath = By.xpath("//SPAN[@class='menu-item-title'][text()='Customers']");
	By AddNewButtonXpath = By.xpath("//A[@class='btn bg-blue']");
	By EmailTextBoxXpath = By.xpath("//INPUT[@id='Email']");
	By PasswordTextBoxXpath = By.xpath("//INPUT[@id='Password']");
	By FirstnameTextBoxXpath = By.xpath("//INPUT[@id='FirstName']");
	By LastNameTextBoxXpath = By.xpath("//INPUT[@id='LastName']");
	By MaleRadioButtonBoxXpath = By.xpath("//INPUT[@id='Gender_Male']");
	By FeMaleRadioButtonXpath = By.xpath("//INPUT[@id='Gender_Female']");
	By DoBXpath = By.xpath("//INPUT[@id='DateOfBirth']");
	By CompanyNameXpath = By.xpath("//INPUT[@id='Company']");
	By RegisterDeleteButtonXpath = By.xpath("//SPAN[@unselectable='on'][text()='delete']");
	By CustomerRolesXpath = By.xpath("//DIV[@class='k-multiselect-wrap k-floatwrap']");
	By ListItemAdministratorsXpath = By.xpath("//LI[@id='SelectedCustomerRoleIds_option_selected']");
	By ListItemGuestsXpath = By.xpath("//LI[@tabindex='-1'][text()='Guests']");
	By ListItemVendorsXpath = By.xpath("//LI[@tabindex='-1'][text()='Vendors']");
	By ManageofVendorXpath = By.xpath("//SELECT[@id='VendorId']");
	By AdminCommentXpath = By.xpath("//TEXTAREA[@id='AdminComment']");
	By SubmitButtonXpath = By.xpath("(//BUTTON[@type='submit'])[2]"); 
	
	
	public void clickMenuCustomer()
	{
		driver.findElement(menuCustomerXpath).click();
	}
	
	public void clickItemCustomer()
	{
		driver.findElement(itemCustomerXpath).click();
	}
	
	public void clickAddNewButton()
	{
		driver.findElement(AddNewButtonXpath).click();
	}
	
	public void SetEmail(String email)
	{
		driver.findElement(EmailTextBoxXpath).sendKeys(email);
	}
	
	public void SetPassword(String password)
	{
		driver.findElement(PasswordTextBoxXpath).sendKeys(password);
	}
	
	public void SetFirstname(String Firstname)
	{
		driver.findElement(FirstnameTextBoxXpath).sendKeys(Firstname);
	}
	
	public void Setlasstname(String LastName)
	{
		driver.findElement(LastNameTextBoxXpath).sendKeys(LastName);
	}
	
	public void SetGender(String gender)
	{
		if(gender.equals("Male"))
		{
			driver.findElement(MaleRadioButtonBoxXpath).click();
		}
		else if(gender.equals("Female"))
		{
			driver.findElement(FeMaleRadioButtonXpath).click();
		}
		else
		{			
			driver.findElement(MaleRadioButtonBoxXpath).click(); //default		
		}
	}
	
	public void SetDateofBirth(String date)
	{
		driver.findElement(DoBXpath).sendKeys(date);
	}
	
	public void SetCompanyName(String companyName)
	{
		driver.findElement(CompanyNameXpath).sendKeys(companyName);
	}
	
	public void DefaultRegisterDelete()
	{
		driver.findElement(RegisterDeleteButtonXpath).click();
	}
	
	public void SetCustomerRoles(String role) throws InterruptedException
	{
		driver.findElement(CustomerRolesXpath).click();
		Thread.sleep(3000L);
		
		WebElement listItem;
		
		if(role.equals("Administrators"))
		{
			listItem = driver.findElement(ListItemAdministratorsXpath);
		}
		else if(role.equals("Guests"))
		{
			listItem = driver.findElement(ListItemGuestsXpath);
		}
		
		else if(role.equals("Vendors"))
		{
			listItem = driver.findElement(ListItemVendorsXpath);
		}
		else
		{
			listItem = driver.findElement(ListItemGuestsXpath); //default
		}
		
		//listItem.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", listItem);
	}
	
	public void SetManageofVendor(String value)
	{
		Select drp =new  Select(driver.findElement(ManageofVendorXpath));
		drp.selectByVisibleText(value);
	}
	
	public void SetAdminComment(String comment)
	{
		driver.findElement(AdminCommentXpath).sendKeys(comment);
	}
	
	public void ClickSubmitButton()
	{
		driver.findElement(SubmitButtonXpath).click();
	}
	
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	
	
	

}
