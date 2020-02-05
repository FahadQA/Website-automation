package ProductAddToWishlistPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoWishList {
	
	WebDriver driver;
	
	public AddtoWishList(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(xpath = "//INPUT[@type='text']")
	WebElement ProductSearchingtextBox ;
	
	@FindBy(xpath ="(//BUTTON[@type='button'])[4]")
	WebElement ProductSearchButton;

	@FindBy(xpath = "(//I[@class='fa fa-heart'])[3]")
	WebElement AddProductToWishList ;
	
    @FindBy(xpath = "//DIV[@class='alert alert-success alert-dismissible']")
    WebElement AddProductToWishListVerify;
	
	public void ProvideProductNameInProductSearchingtextBox(String SearchName)
	{
		ProductSearchingtextBox.sendKeys(SearchName);
	}
	
	public void ClickInProductSearchButton()
	{
		ProductSearchButton.click();
	}
	
	public void ClickAddToWishList()
	{
		AddProductToWishList.click();
	}
	
	public void AddProductToWishListVerification()
	{
		String expectedMessage = " Success: You have added MacBook to your wish list!";
		String actualMesssage = AddProductToWishListVerify.getText();
		
		assertEquals(actualMesssage, expectedMessage);
		
		System.out.println("product add in wishlist message : "+AddProductToWishListVerify.getText() );
	}
	
	
}
