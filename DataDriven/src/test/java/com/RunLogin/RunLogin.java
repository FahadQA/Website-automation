package com.RunLogin;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.DataReadController.DataReadController;

import LoginPageElementPackage.LoginPageElement;
import Xls_Reader_Package.Xls_Reader;

public class RunLogin  {
	
	WebDriver driver = new ChromeDriver();
	
	LoginPageElement lp = new LoginPageElement(driver);
	DataReadController dc = new DataReadController();
	
	
	Xls_Reader reader = new Xls_Reader("E:\\peopleNtech\\WebAutomationGit\\Website-automation\\DataDriven\\src\\test\\java\\com\\UserData\\UserInfoData.xlsx");
	
//	
//	String email = reader.getCellData("UserDataInfo", "User email", 2);
//	String password = reader.getCellData("UserDataInfo", "User Passsword", 2);
	
	public boolean userIsLoggedIn()
	{
		String expecteInvalidEmaildMessage = "My Account";
		String actualInvalidEmaildMessage = lp.UserAccountIdentity();
	   // assertEquals(expecteInvalidEmaildMessage, actualInvalidEmaildMessage);
	    System.out.println(lp.UserAccountIdentity());
	    return true;
		
	}
	
	public boolean userIDorPasswordIsWrong()
	{
		//String expecteInvalidEmaildMessage = "Warning: No match for E-Mail Address and/or Password.";
		lp.IDorPasswordIsWrong();
	    //assertEquals(expecteInvalidEmaildMessage, actualInvalidEmaildMessage);
	    System.out.println(lp.IDorPasswordIsWrong());
	    return true;
		
	}
	
	
	//  =====open browser=====
	@BeforeTest
	public void openBrowser()
	{
		driver.get("https://demo.opencart.com/");
		System.out.println("browser open");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		lp.clickMyaccount();
		lp.clickLoginButton();
	}
	
	// ====login positive test====
	@Test
	public void loginPositiveTest() throws InterruptedException
	{
		lp.clickMyaccount();
		lp.clickLoginButton();
//		lp.enterEmail(dc.Email());
//		lp.enterPassword(dc.Password());
		lp.clickSubmitButton();
//		Thread.sleep(3000L);
//		lp.clickMyaccount();
//		lp.clickLogoutButton();
		
		
		

	}
	
	// ====get registerd user email & password====
	
	@Test
	public void getEmail_Password()
	{
		int rowCount = reader.getRowCount("UserDataInfo");
		System.out.println(rowCount);
		
		
		for(int rowNum = 2; rowNum<=rowCount; rowNum++)
		{
			 String Email = reader.getCellData("UserDataInfo", "User email", rowNum);
			 System.out.println("row number is: "+rowNum);
			 String Passsword = reader.getCellData("UserDataInfo", "User Passsword", rowNum);
			 System.out.println(Passsword);
			
			lp.enterEmail(Email);
			lp.enterPassword(Passsword);
			lp.clickSubmitButton();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
			if(userIDorPasswordIsWrong()==(lp.IDorPasswordIsWrong()))
			{
				
				System.out.println("invalid id");
			
			}
			else if (userIsLoggedIn()==lp.UserAccountIdentity())
			{
				System.out.println("nothing found valid id");
			}
			else
			{
				System.out.println("nothing found");
			}
		
       	}
	
	}
	
	
}


	



