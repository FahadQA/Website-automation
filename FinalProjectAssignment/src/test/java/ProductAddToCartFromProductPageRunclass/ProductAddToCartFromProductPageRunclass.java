package ProductAddToCartFromProductPageRunclass; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProductAddToCartFromProductPagePackage.ProductAddToCartFromProductPage;

public class ProductAddToCartFromProductPageRunclass {
	
	WebDriver driver = new ChromeDriver();
	
	ProductAddToCartFromProductPage ProductAddToCart = new ProductAddToCartFromProductPage(driver);
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void Add_Product_To_Cart_From_Product_Page()
	{
		ProductAddToCart.ProvideProductNameInProductSearchingtextBox("mac");
		ProductAddToCart.ClickInProductSearchButton();
		ProductAddToCart.ClickAddProductToCart();
	}

}
