package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinationClass {
	
	
	WebDriver driver;
	
	
	
	@Given("^when user is in the login page$")
	public void when_user_is_in_the_login_page()  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://login.yahoo.com/account/create");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			
	    
	}
	
	
	

	@Given("^user enter firstName$")
	public void user_enter_firstName()  {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Tom");
		
		
	    
	}
	
	

	@When("^user enters lastName$")
	public void user_enters_lastName()  {
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Bob");
			
	    
	}
	
	

	@Given("^user enter invalid firstName$")
	public void user_enter_invalid_firstName()  {
		
		
	    
	}

	@When("^user enters invalid lastName$")
	public void user_enters_invalid_lastName()  {
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("John");
		
		
		
	    
	}
	
	
	@After
	public void setuptest() {
		
		//driver.quit();
		
		
			
		}
	
	

	@Given("^I want to write a step with $")
	public void i_want_to_write_a_step_with()  {
		
		
	    
	}

	@When("^I check for the  in step$")
	public void i_check_for_the_in_step()  {
		
		
	    
	}
	
	

	@Then("^I verify the  in step$")
	public void i_verify_the_in_step()  {
		
		
	    
	}  
	
	
	    //Data driven testing
	
	@Given("^user is in login page$")
	public void user_is_in_login_page()  {
		
        
	    
	}

	@When("^user enter's \"([^\"]*)\" in the userName test box$")
	public void user_enter_s_in_the_userName_test_box(String firstName)  {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(firstName);
	    
	}

	@Then("^user enter's \"([^\"]*)\" in the lastName text box$")
	public void user_enter_s_in_the_lastName_text_box(String lastName)  {
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(lastName);
	    
	}

	@Then("^user should navigate to expected page \"([^\"]*)\"$")
	public void user_should_navigate_to_expected_page(String webpage)  {
		
		
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(webpage, actualUrl);
		
		
		
		
		
		
		
	    
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
