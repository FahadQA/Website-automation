package ProductSearchingPackage;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch {
	
	WebDriver driver;
	
	public ProductSearch (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//H1[text()='Search - mac'])[1]")
	WebElement productSearchResultPage;
	
	@FindBy(xpath = "//INPUT[@type='text']")
	WebElement ProductSearchingtextBox;
	
	@FindBy(xpath = "(//BUTTON[@type='button'])[4]")
	WebElement ProductSearchButton;
	
	public void ProvideProductNameInProductSearchingtextBox(String SearchName)
	{
		ProductSearchingtextBox.sendKeys(SearchName);
	}
	
	public void ClickInProductSearchButton()
	{
		ProductSearchButton.click();
	}
	
	public void ProductSearchResulttext()
	{
		
		String expectedMessage = "Search - mac";
		String actualMesssage = productSearchResultPage.getText();
		
        assertEquals(expectedMessage, actualMesssage);
		
		System.out.println("searsh result is: "+ productSearchResultPage.getText());
		

	}

}
