package ProductSearchRunclass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProductSearchingPackage.ProductSearch;

public class ProductSearchRunClass {
	
	WebDriver driver = new ChromeDriver();
	
	ProductSearch productSearch = new ProductSearch(driver);
	
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		
		driver.get("https://demo.opencart.com/");
		System.out.println("Broweser opened");
		Thread.sleep(3000L);
		
	}
	
	@Test
	public void Product_Searching()
	{
		productSearch.ProvideProductNameInProductSearchingtextBox("mac");
		productSearch.ClickInProductSearchButton();
		
		productSearch.ProductSearchResulttext();
		
		

		
	}
	
	
	

}
