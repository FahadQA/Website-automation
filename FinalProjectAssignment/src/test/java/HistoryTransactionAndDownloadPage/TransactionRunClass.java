package HistoryTransactionAndDownloadPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HistoryTransactionAndDownloadPage.AccountHomePage;
import HistoryTransactionAndDownloadPage.Transaction;
import registrationAndLoginTest.HomePage;
import registrationAndLoginTest.LogIn;

public class TransactionRunClass {
	
WebDriver driver = new ChromeDriver();
	
	HomePage homepage = new HomePage(driver);
	LogIn login = new LogIn(driver);
	AccountHomePage accountHomepage = new AccountHomePage(driver);
	Transaction transaction = new Transaction(driver);
	
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void Verify_User_In_Transaction_Page()
	{
        homepage.HomepageToLogIn();
    	
    	login.provideEmail("ka8@k.com");
    	login.providePassword("1234");
    	login.clickLoginButton();	
    	
    	accountHomepage.TransactionPageClick();
    	
    	String expecteInvalidEmaildMessage = "Your Transactions";
		String actualInvalidEmaildMessage = transaction.TransactionPage.getText();
		
		assertEquals(expecteInvalidEmaildMessage, actualInvalidEmaildMessage);
		
		System.out.println("User is in: "+ transaction.TransactionPage.getText());
    	
    	
	}

}
