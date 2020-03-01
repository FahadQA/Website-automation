package HistoryTransactionAndDownloadPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	
	WebDriver driver;
	
	public Download (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//H2[text()='Account Downloads']")
	WebElement AccountDownloads;
	
	

}
