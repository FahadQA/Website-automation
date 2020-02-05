package registrationAndLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	WebDriver driver;
	 
	public Registration(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//xpath elements
	
	@FindBy(xpath = "//INPUT[@id='input-firstname']")
	WebElement firstName;
	
	@FindBy(xpath = "//INPUT[@id='input-lastname']")
	WebElement lastName;
	
	@FindBy(xpath = "//INPUT[@id='input-telephone']")
	WebElement telephone;
	
	@FindBy(xpath = "//INPUT[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath = "//INPUT[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath = "//INPUT[@id='input-confirm']")
	WebElement confirmpassword;
	
	@FindBy(xpath = "//INPUT[@type='checkbox']")
	WebElement checkboxClick;
	
	@FindBy(xpath = "//INPUT[@type='submit']" )
	WebElement submitButton;
	
	@FindBy(xpath="//H1[text()='Your Account Has Been Created!']/self::H1")
	WebElement regSuccessMessage;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='E-Mail Address does not appear to be valid!']")
	WebElement emailAddressIsBlank;
	
	@FindBy(xpath="//DIV[@class='alert alert-danger alert-dismissible']")
	WebElement emailAddressIsAlreadyTaken;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='Telephone must be between 3 and 32 characters!']")
	WebElement telephoneNumberMoreThanThirtytwoOrLessThanZero;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='Password must be between 4 and 20 characters!']")
	WebElement passwordValidation;
	
	@FindBy(xpath="//DIV[@class='text-danger'][text()='Password confirmation does not match password!']")
	WebElement ConfirmpasswordValidation;
	
	@FindBy(xpath="//DIV[@class='alert alert-danger alert-dismissible']")
	WebElement checkBoxIsNotClickedMessage;
	
	
	
	
	
	
	//methods
	public void provideFirstname(String firstname)
	{
		firstName.sendKeys(firstname);
	}
	
	public void provideLaststname(String lastname)
	{
		lastName.sendKeys(lastname);
	}
	
	public void provideEmail(String emailaddress)
	{
		email.sendKeys(emailaddress);
	}
	
	public void provideTelephone(String phonenumber)
	{
		telephone.sendKeys(phonenumber);
	}
	
	public void providePassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void provideConfirmPassword(String confirmPass)
	{
		confirmpassword.sendKeys(confirmPass);
	}
	
	public void checkBoxclick()
	{
		checkboxClick.click();
	}
	
	public void submitButtoClick()
	{
		submitButton.click();
	}
	
	

}

