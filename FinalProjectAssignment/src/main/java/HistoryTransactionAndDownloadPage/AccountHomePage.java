package HistoryTransactionAndDownloadPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountHomePage {
	
WebDriver driver;
	
	public AccountHomePage (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//A[@href='https://demo.opencart.com/index.php?route=account/order'][text()='Order History'][text()='Order History'])[2]")
	WebElement OrderhistoryPage;
	
	@FindBy(xpath="(//A[@href='https://demo.opencart.com/index.php?route=account/transaction'][text()='Transactions'][text()='Transactions'])[2]")
	WebElement TransactionPage;
	
	@FindBy(xpath="(//A[@href='https://demo.opencart.com/index.php?route=account/download'][text()='Downloads'][text()='Downloads'])[3]")
	WebElement DownloadPage;
	
	public void OrderhistoryPageClick()
	{
		OrderhistoryPage.click();;
	} 
	
	public void TransactionPageClick()
	{
		TransactionPage.click();;
	} 
	
	public void DownloadPageClick()
	{
		DownloadPage.click();;
	} 



}
