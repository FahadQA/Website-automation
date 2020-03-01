package HistoryTransactionAndDownloadPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory {
	
	WebDriver driver;
	
	public OrderHistory (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//H1[text()='Order History'])[1]")
	WebElement OrderHistory;
	 

}
