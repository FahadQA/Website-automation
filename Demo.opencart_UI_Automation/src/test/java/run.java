import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class run {
	
	WebDriver driver = new ChromeDriver();
	test t = new test(driver);
	
	@BeforeTest
	public void openbroweser()
	{
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	@Test
	public void ruun() throws InterruptedException
	{
		t.enterEmail("admin@yourstore.com");
		t.enterPassword("admin");
		t.clickSubmitButton();
		Thread.sleep(3000L);
		t.clickMenuCustomer();
		t.clickItemCustomer();
	    t.provideEmail("test");
	}
	
	

}
