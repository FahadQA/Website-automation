package PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import com.sun.tools.javac.util.List;

import WaitHelper.WaitHelper;

public class SearchCustomerPageObject {
	
WebDriver driver;

	
WaitHelper wh = new WaitHelper(driver);
	public SearchCustomerPageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//INPUT[@id='SearchEmail']")
    WebElement ProvideEmailXpath;
	
	@FindBy(xpath = "//INPUT[@id='SearchFirstName']")
    WebElement FirstnameXpath;
	
	@FindBy(xpath = "//INPUT[@id='SearchLastName']")
    WebElement LastnameXpath;
	
	@FindBy(xpath = "//BUTTON[@id='search-customers']")
    WebElement SearchCustomersXpath;
	
	@FindBy(xpath = "//table[@id='customers-grid']/tbody/tr")
    WebElement Table;

	@FindBy(xpath = "//table[@id='customers-grid']/tbody/tr")
    List <WebElement> TableRowsXpath;
	
	@FindBy(xpath ="//table[@id='customers-grid']/tbody/tr/td")
    List <WebElement> TableColumnXpath;
	
//	By ProvideEmailXpath = By.xpath("//INPUT[@id='SearchEmail']");
//	By FirstnameXpath = By.xpath("//INPUT[@id='SearchFirstName']");
//	By LastnameXpath = By.xpath("//INPUT[@id='SearchLastName']");
//	By SearchCustomersXpath = By.xpath("//BUTTON[@id='search-customers']");
//	By Table = By.xpath("//table[@id='customers-grid']/tbody/tr");
	
   
    
	
	public void SetEmail(String email) 
	{   
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    ProvideEmailXpath.clear();
	    ProvideEmailXpath.sendKeys(email);
	}
	
	public void FirstName(String Firstname)
	{
		FirstnameXpath.sendKeys(Firstname);
	}
	
	public void LastName(String Lastname)
	{
		LastnameXpath.sendKeys(Lastname);
	}
	
	public int getRowsNum()
	{
		return (TableRowsXpath.size());
	}
	
	public int getColumnsNum()
	{
		return (TableColumnXpath.size());
	}
    
	public boolean VerifyUserInfo(String email)
	{
		boolean flag = false;
		
	     for(int i = 1; i<=getRowsNum(); i++)
	     {
	    	 WebElement emailID = Table.findElement((By) By.xpath("//table[@id='customers-grid']/tbody/tr[\"+i+\"]/td[2]"));
	    	 
	    	 System.out.println(emailID);
	    	 
	    	 if(emailID.equals(email))
		     {
		    	 flag = true;
		     }
	    	
	     }
	     return flag;
	     
	}
	
	public void ClickSubmitButton()
	{
	     SearchCustomersXpath.click();
	}
	
	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
}
