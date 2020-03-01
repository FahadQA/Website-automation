package HistoryTransactionAndDownloadPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction {
	
	WebDriver driver;
	
	public Transaction(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//H1[text()='Your Transactions'])[1]")
	WebElement TransactionPage;

}
