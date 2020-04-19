package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.BaseClass;
import PageObject.AddCustomerPageObject;
import PageObject.LogInPageObject;
import PageObject.SearchCustomerPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepDef extends BaseClass{
	
	//SearchCustomerPageObject sc = new SearchCustomerPageObject(driver);

	

	@Given("user is in login page")
	public void user_is_in_login_page() {
	    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}

	@When("user gives email and password")
	public void user_gives_email_and_password() {
	    pg.enterEmail("admin@yourstore.com");
	    pg.enterPassword("admin");
	}

	@And("clicks on submit button")
	public void clicks_on_submit_button() {
	   pg.clickSubmitButton();
	}

	@Then("user is in home page")
	public void user_is_in_home_page() {
		String expectedMessage = "Dashboard / nopCommerce administration";
		String actualMessage = pg.UserAccountIdentity();
		Assert.assertEquals(expectedMessage, actualMessage);
		//System.out.println(pg.UserAccountIdentity());
	}
	
	@When("user clicks in Customers from menu")
	public void user_clicks_in_Customers_from_menu() {
		addC = new AddCustomerPageObject(driver);
		addC.clickMenuCustomer();
	}

	@And("user select customers from Customers menu")
	public void user_select_customers_from_Customers_menu() {
		addC.clickItemCustomer();
	}

//	@And("user clicks in Add new customer")
//	public void user_clicks_in_Add_new_customer() {
//		addC.clickAddNewButton();
//	}
//
//	@Then("user is in Add new customer page")
//	public void user_is_in_Add_new_customer_page() {
//		String expectedMessage = "Add a new customer / nopCommerce administration";
//		String actualMessage = addC.getPageTitle();
//		
//		Assert.assertEquals(expectedMessage, actualMessage);
//	}
//
//	@When("user enters customer info")
//	public void user_enters_customer_info() throws InterruptedException {
//		
//		String email = randomValue()+"@gmail.com";
//		addC.SetEmail(email);
//		addC.SetPassword("Test1234");
//		addC.SetFirstname("fahad");
//		addC.Setlasstname("khan");
//		addC.SetGender("Male");
//		addC.SetDateofBirth("5/25/1992");
//		addC.SetCompanyName("IT company");
//		addC.DefaultRegisterDelete();
//		Thread.sleep(3000L);
//		addC.SetCustomerRoles("Guests");
//		addC.SetManageofVendor("Vendor 1");
//		addC.SetAdminComment("hello");
//	}
//
//	@And("clicks on save button")
//	public void clicks_on_save_button() {
//		addC.ClickSubmitButton();
//	}
//
//	@Then("user can see add customer successful message")
//	public void user_can_see_add_customer_successful_message() {
//		String expectedMessage = "Customers / nopCommerce administration";
//		String actualMessage = addC.getPageTitle();
//		
//		Assert.assertEquals(expectedMessage, actualMessage);
//		driver.close();
//	}
	
	@Then("user is in search customer page")
	public void user_is_in_search_customer_page() {
		String expectedMessage = "Customers / nopCommerce administration";
		String actualMessage = addC.getPageTitle();
		System.out.println(addC.getPageTitle());
		Assert.assertEquals(expectedMessage, actualMessage);
		
		
	}

	@When("user provide registered email id")
	public void user_provide_registered_email_id(){
	    sc = new SearchCustomerPageObject(driver);
		sc.SetEmail("victoria_victoria@nopCommerce.com");
	}

	@And("user click on search button")
	public void user_click_on_search_button() {
		sc.ClickSubmitButton();
	 
	}

	@Then("user info is displayed")
	public void user_info_is_displayed() {
	   sc.VerifyUserInfo("victoria_victoria@nopCommerce.com");
	}

	
	

	
	

}
