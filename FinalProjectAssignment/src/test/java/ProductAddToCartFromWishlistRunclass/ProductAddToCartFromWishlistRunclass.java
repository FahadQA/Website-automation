package ProductAddToCartFromWishlistRunclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProductAddToCartFromWishlistPackage.Login;
import ProductAddToCartFromWishlistPackage.ProductAddToCartFromWishlist;

public class ProductAddToCartFromWishlistRunclass {

	WebDriver driver = new ChromeDriver();
	Login login = new Login(driver);
	
	ProductAddToCartFromWishlist productAddToCartFromWishlist = new ProductAddToCartFromWishlist(driver);
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void Add_To_Cart_From_WishList()
	{
		productAddToCartFromWishlist.ProvideProductNameInProductSearchingtextBox("Mac");
		productAddToCartFromWishlist.ClickInProductSearchButton();
		productAddToCartFromWishlist.ClickAddToWishList();
		productAddToCartFromWishlist.ClickWishListbutton();
		
		login.provideEmail("ka8@k.com");
		login.providePassword("1234");
		login.clickLoginButton();
		
		
		productAddToCartFromWishlist.ClickAddToCartButtonInWishListPage();
		
		//addToWishList.AddProductToWishListVerification();
	}
}
