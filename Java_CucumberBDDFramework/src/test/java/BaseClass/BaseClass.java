package BaseClass;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddCustomerPageObject;
import PageObject.LogInPageObject;
import PageObject.SearchCustomerPageObject;

public class BaseClass {
	
public WebDriver driver = new ChromeDriver();
	
public LogInPageObject pg  = new LogInPageObject(driver);

public AddCustomerPageObject addC;

public SearchCustomerPageObject sc;

public static String randomValue()
{
	String randomValue = RandomStringUtils.randomAlphabetic(5);
	return randomValue;
}

}
