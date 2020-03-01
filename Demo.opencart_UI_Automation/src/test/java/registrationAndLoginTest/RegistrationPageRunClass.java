package registrationAndLoginTest;

import static org.testng.Assert.assertEquals;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import registrationAndLoginTest.HomePage;
import registrationAndLoginTest.Registration;

public class RegistrationPageRunClass {
	
	
	WebDriver driver = new ChromeDriver();
	
    HomePage homepage = new HomePage(driver);
    Registration reg = new Registration(driver);
    
    
    
    String fname = RandomStringUtils.randomAlphabetic(12); 
	String lname = RandomStringUtils.randomAlphabetic(12);
	String emailAddress = RandomStringUtils.randomAlphabetic(12)+"@mail.com";
	String phoneNo = "01"+RandomStringUtils.randomNumeric(9);
	String password = RandomStringUtils.randomNumeric(30);
	String conpassword = password;
    
    
    @BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
    
    @Test
	public void NewregistrationSuccess()
	{
    	
    	homepage.HomepageToRegistration();
	
    	reg.provideFirstname(fname);
    	reg.provideLaststname(lname);
    	reg.provideTelephone(phoneNo);
    	reg.provideEmail(emailAddress);
        reg.providePassword(password);
        reg.provideConfirmPassword(conpassword);		
        reg.checkBoxclick();
        reg.submitButtoClick();
        
        String expectedMessage = "Your Account Has Been Created!";
		String actualMesssage = reg.regSuccessMessage.getText();
		
		assertEquals(actualMesssage, expectedMessage);
		
		System.out.println("Account created");
		

	}
    
    
    @Test
   	public void Email_Address_Text_Field_is_Blank_Negative_Test()
   	{
       	
       	homepage.HomepageToRegistration();
   	
       	reg.provideFirstname(fname);
       	reg.provideLaststname(lname);
       	reg.provideTelephone(phoneNo);
       	reg.provideEmail("");
        reg.providePassword(password);
        reg.provideConfirmPassword(conpassword);		
        reg.checkBoxclick();
        reg.submitButtoClick();
           
        String expectedMessage = "E-Mail Address does not appear to be valid!";
   		String actualMesssage = reg.emailAddressIsBlank.getText();
   		
   		assertEquals(actualMesssage, expectedMessage);
   		
   		System.out.println("Email address is blank");
   		

   	}
    
    
    @Test
   	public void Email_Address_is_Already_Taken_Negative_Test()
   	{
       	
       	homepage.HomepageToRegistration();
   	
       	reg.provideFirstname(fname);
       	reg.provideLaststname(lname);
       	reg.provideTelephone(phoneNo);
       	reg.provideEmail("a@mail.com");
        reg.providePassword(password);
        reg.provideConfirmPassword(conpassword);		
        reg.checkBoxclick();
        reg.submitButtoClick();
           
        String expectedMessage = "Warning: E-Mail Address is already registered!";
		String actualMesssage = reg.emailAddressIsAlreadyTaken.getText();
		
		assertEquals(expectedMessage, actualMesssage);
		
		System.out.println("user cannot register for providing exisiting email address. the message is: "+ reg.emailAddressIsAlreadyTaken.getText());

   	}
    
    
    @Test
   	public void TelephoneNo_More_Than_32_or_Less_Than_0_Negative_Test()
   	{
       	
       	homepage.HomepageToRegistration();
   	
       	reg.provideFirstname(fname);
       	reg.provideLaststname(lname);
       	reg.provideTelephone("");
       	reg.provideEmail(emailAddress);
        reg.providePassword(password);
        reg.provideConfirmPassword(conpassword);		
        reg.checkBoxclick();
        reg.submitButtoClick();
           
        String expectedMessageforInvalidphoneNuber = "Telephone must be between 3 and 32 characters!";
		String actualMesssageforInvalidphoneNuber = reg.telephoneNumberMoreThanThirtytwoOrLessThanZero.getText();
		
		assertEquals(expectedMessageforInvalidphoneNuber, actualMesssageforInvalidphoneNuber);
		
		System.out.println("telephone number is invalid due to: " + reg.telephoneNumberMoreThanThirtytwoOrLessThanZero.getText());
   	}
    
    @Test
   	public void Password_Must_be_Between_4_or_20_charecter_Negative_Test() //note: when running from testNG with more than 20 charecter password, user is registerd
   	{
       	
       	homepage.HomepageToRegistration();
   	
       	reg.provideFirstname(fname);
       	reg.provideLaststname(lname);
       	reg.provideTelephone(phoneNo);
       	reg.provideEmail(emailAddress);
        reg.providePassword("");
        reg.provideConfirmPassword("");		
        reg.checkBoxclick();
        reg.submitButtoClick();
           
        String expectedMessageforvalidPassword = "Password must be between 4 and 20 characters!";
   		String actualMesssageforvalidPassword = reg.passwordValidation.getText();
   		
   		assertEquals(expectedMessageforvalidPassword, actualMesssageforvalidPassword);
   		
   		System.out.println("password is invalid due to: " + reg.passwordValidation.getText());
   		

   	}
    
    
    @Test
   	public void Password_is_Not_Matching_With_Confirm_Password_Text_Field_Negative_Test() 
   	{
       	
       	homepage.HomepageToRegistration();
   	
       	reg.provideFirstname(fname);
       	reg.provideLaststname(lname);
       	reg.provideTelephone(phoneNo);
       	reg.provideEmail(emailAddress);
        reg.providePassword(password);
        reg.provideConfirmPassword("");		
        reg.checkBoxclick();
        reg.submitButtoClick();
           
        String expectedMessageforvalidConfirmPassword = "Password confirmation does not match password!";
		String actualMesssageforvalidConfirmPassword = reg.ConfirmpasswordValidation.getText();
		
		assertEquals(expectedMessageforvalidConfirmPassword, actualMesssageforvalidConfirmPassword);
		
		System.out.println("password invalid due to: " + reg.ConfirmpasswordValidation.getText()); 
   		

   	}
    
    @Test
   	public void CheckBox_Is_Not_Clicked__Negative_Test() 
   	{
       	
       	homepage.HomepageToRegistration();
   	
       	reg.provideFirstname(fname);
       	reg.provideLaststname(lname);
       	reg.provideTelephone(phoneNo);
       	reg.provideEmail(emailAddress);
        reg.providePassword(password);
        reg.provideConfirmPassword(conpassword);		
        //reg.checkBoxclick();
        reg.submitButtoClick();
           
        String expectedMessageforCheckBoxIsClicked = "Warning: You must agree to the Privacy Policy!";
		String actualMesssageforcheCkBoxIsClicked = reg.checkBoxIsNotClickedMessage.getText();
		
		assertEquals(expectedMessageforCheckBoxIsClicked, actualMesssageforcheCkBoxIsClicked);
		
		System.out.println("user is not registered because: " + reg.checkBoxIsNotClickedMessage.getText()); 
   		

   	}
    
    
    
    
}
