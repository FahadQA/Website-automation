package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.pageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepDef {
	
	WebDriver driver = new ChromeDriver();
	
	pageObject pg  = new pageObject(driver);
	

	@Given("user is in login page")
	public void user_is_in_login_page() {
	    driver.get("https://demo.opencart.com/index.php?route=account/login");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}

	@When("user gives email and password")
	public void user_gives_email_and_password() {
	    pg.enterEmail("d1@mail.com");
	    pg.enterPassword("12341234");
	}

	@And("clicks on submit button")
	public void clicks_on_submit_button() {
	   pg.clickSubmitButton();
	}

	@Then("user is in home page")
	public void user_is_in_home_page() {
		String expectedMessage = "My Account";
		String actualMessage = pg.UserAccountIdentity();
		Assert.assertEquals(expectedMessage, actualMessage);
		//System.out.println(pg.UserAccountIdentity());
	}
	
	
	

	
	

}
