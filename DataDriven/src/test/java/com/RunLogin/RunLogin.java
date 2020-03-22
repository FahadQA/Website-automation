package com.RunLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.DataReadController.DataReadController;

import LoginPageElementPackage.LoginPageElement;
import Xls_Reader_Package.Xls_Reader;

public class RunLogin {
	
	WebDriver driver = new ChromeDriver();
	
	LoginPageElement lp = new LoginPageElement(driver);
	DataReadController dc = new DataReadController();
//	Xls_Reader reader = new Xls_Reader("E:\\Andriod studio\\eclips 2019\\works\\DataDriven\\src\\test\\java\\com\\UserData\\UserInfoData.xlsx");
//	
//	String email = reader.getCellData("UserDataInfo", "User email", 2);
//	String password = reader.getCellData("UserDataInfo", "User Passsword", 2);
	
	
	
	
	@BeforeTest
	public void openBrowser()
	{
		driver.get("https://demo.opencart.com/");
		System.out.println("browser open");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginPositiveTest()
	{
		lp.clickMyaccount();
		lp.clickLoginButton();
		lp.enterEmail(dc.Email());
		lp.enterPassword(dc.Password());
		lp.clickSubmitButton();
	}
	

}
