package ProductAddToCartFromWishlistPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAddToCartFromWishlist {
	
WebDriver driver;
	
	public ProductAddToCartFromWishlist(WebDriver driver)
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
    
    @FindBy(xpath = "(//I[@class='fa fa-heart'])[1]")
    WebElement WishListbutton;
    
    @FindBy(xpath = "(//I[@class='fa fa-shopping-cart'])[4]")
    WebElement AddToCartButtonInWishListbutton;
    
    
    
    
	
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
	
	public void ClickWishListbutton()
	{
		WishListbutton.click();
	}
	
	public void ClickAddToCartButtonInWishListPage()
	{
		AddToCartButtonInWishListbutton.click();
	}


}
