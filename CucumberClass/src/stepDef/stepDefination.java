package stepDef;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.cucumberpages;

public class stepDefination {
	
	WebDriver driver;
	
	cucumberpages cp;
	
	@Given("^user is in the login page$")
	public void user_is_in_the_login_page()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		cp = new cucumberpages(driver);
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.manage().deleteAllCookies();
		
		
	    
	}
	
	@Before
	public void beforetest() {
		
		
		
		
	}

	@When("^user enters right username$")
	public void user_enters_right_username(){
		
		//Create page object model class
		
		cp.getUserId().sendKeys("standard_user");
	    
	}

	@When("^user enters right password$")
	public void user_enters_right_password()  {
		
		//Calling the functions
		
		cp.getPassword().sendKeys("secret_sauce");
	    
	}
	
	@When("^user click on login button$")
	public void user_click_on_login_button() {
		
		cp.getloginButton().click();
		
		
	    
	}

	@Then("^user should able to login$")
	public void user_should_able_to_login()  {
		
		String actualurl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl,"https://www.saucedemo.com/inventory.html");
		
		
	    
	}
	
	@After
	public void aftertest() {
		
		driver.quit();
		
	}
	
	
	// Negative testing for login page
	
	@When("^user enters wrong username$")
	public void user_enters_wrong_username() {
		
		
	    
	}

	@When("^user enters wrong password$")
	public void user_enters_wrong_password()  {
		
		
	   
	}

	@When("^user click on login button with wrong data$")
	public void user_click_on_login_button_with_wrong_data()  {
	    
		
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login()  {
	   
	}
	
	
	//Data Drive testing
	
	
	@When("^user enters \"([^\"]*)\" in the userid text box$")
	public void user_enters_in_the_userid_text_box(String arg1)  {
	    
		cp.getUserId().sendKeys(arg1);
	}

	@When("^user enters \"([^\"]*)\" in the password text box$")
	public void user_enters_in_the_password_text_box(String arg1)  {
	    
		cp.getPassword().sendKeys(arg1);
	}

	@Then("^user should nevigate to the expected \"([^\"]*)\"$")
	public void user_should_nevigate_to_the_expected(String arg1)  {
		
		//Validation code
		
        String actualurl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl,arg1);
	    
	}
	
	
	@Then("^user should nevigate to the \"([^\"]*)\"$")
	public void user_should_nevigate_to_the(String arg1){
		
		cp.getloginButton().click();
		
		String actualurl = driver.getCurrentUrl();
		
		Assert.assertEquals(actualurl, arg1);
	    
	}
	
	
	
	
	// Sample sign up page
	
	
	
	
	@Given("^user login to signup page$")
	public void user_login_to_signup_page()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://login.yahoo.com/account/create");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		cp = new cucumberpages(driver);
		
		driver.manage().deleteAllCookies();
	    
	}

	@When("^user enters firstname \"([^\"]*)\" for signup page$")
	public void user_enters_firstname_for_signup_page(String arg1) {
		
		cp.getfirstName().sendKeys(arg1);
		
		
		
	}

	@When("^user enters lastname \"([^\"]*)\" for signup page$")
	public void user_enters_lastname_for_signup_page(String arg1)  {
		
		
		cp.getlastName().sendKeys(arg1);
		
		
		
	    
	}






	
	
	
	
	
	
	
	
	



}
