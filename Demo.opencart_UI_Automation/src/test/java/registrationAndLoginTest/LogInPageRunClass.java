package registrationAndLoginTest;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import registrationAndLoginTest.HomePage;
import registrationAndLoginTest.LogIn;

public class LogInPageRunClass {
	
	WebDriver driver = new ChromeDriver();
	
    HomePage homepage = new HomePage(driver);
    LogIn login = new LogIn(driver);
    
    String emailAddress = RandomStringUtils.randomAlphabetic(12)+"@mail.com";
    String password = RandomStringUtils.randomNumeric(9);
    
    @BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		
		Thread.sleep(3000L);
		
	}
    
    @Test
    public void loginSuccess_Positive_Test()
    {
    	homepage.HomepageToLogIn();
    	
    	login.provideEmail("ka8@k.com");
    	login.providePassword("1234");
    	login.clickLoginButton();
    	
    }
    
    @Test
    public void Invalid_Email_login_Negative_Test()
    {
    	homepage.HomepageToLogIn();
    	
    	login.provideEmail("karvtf8@k.com");
    	login.providePassword("1234");
    	login.clickLoginButton();
    	
    	String expecteInvalidEmaildMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualInvalidEmaildMessage = login.InvalidEmailAlert.getText();
		
	    assertEquals(expecteInvalidEmaildMessage, actualInvalidEmaildMessage);
		
		System.out.println("cannot login due to: "+ login.InvalidEmailAlert.getText());
    	
    }
    
    @Test
    public void Invalid_Password_login_Negative_Test()
    {
    	homepage.HomepageToLogIn();
    	
    	login.provideEmail("ka8@k.com");
    	login.providePassword("1234ffffff");
    	login.clickLoginButton();
    	
    	String expecteInvalidEmaildMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualInvalidEmaildMessage = login.InvalidPasswordAlert.getText();
		
		assertEquals(expecteInvalidEmaildMessage, actualInvalidEmaildMessage);
		
		System.out.println("cannot login due to: "+ login.InvalidPasswordAlert.getText());
    }

}
