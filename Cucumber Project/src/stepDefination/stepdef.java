package stepDefination;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	
	WebDriver driver;
	
	
	
	@Given("^User is in the login page$")
	public void user_is_in_the_login_page()  {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	   
	}

	@When("^user enters \"([^\"]*)\" in firstname textBox$")
	public void user_enters_in_firstname_textBox(String firstName)  {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys(firstName);
	    
	}

	@Then("^user enters \"([^\"]*)\" in the lastName textbox$")
	public void user_enters_in_the_lastName_textbox(String lastName)  {
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys(lastName);
	   
	}

	@Then("^User should navigate to expected page \"([^\"]*)\"$")
	public void user_should_navigate_to_expected_page(String webpage)  {
		
			
		String actualUrl = driver.getCurrentUrl();
		
	Assert.assertEquals(actualUrl, webpage);
		
		//System.out.println(actualUrl);
		
		
		
		
		
		
		
		
		
		
	    
	}



}
