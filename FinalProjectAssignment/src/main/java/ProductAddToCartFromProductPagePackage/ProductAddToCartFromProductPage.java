package ProductAddToCartFromProductPagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAddToCartFromProductPage {
	
WebDriver driver;
	
	public ProductAddToCartFromProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(xpath = "//INPUT[@type='text']")
	WebElement ProductSearchingtextBox ;
	
	@FindBy(xpath ="(//BUTTON[@type='button'])[4]")
	WebElement ProductSearchButton;

	@FindBy(xpath ="(//I[@class='fa fa-shopping-cart'])[5]")
	WebElement AddProductToCart ;
	
	 @FindBy(xpath = "(//I[@class='fa fa-shopping-cart'])[1]")
	 WebElement ShoppingCarttbutton;
	
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
	
	public void ClickAddProductToCart()
	{
		AddProductToCart.click();
	}
	
	public void ClickShoppingCartButton()
	{
		ShoppingCarttbutton.click();
	}

}
