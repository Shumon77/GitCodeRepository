package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cucumberpages {
	
	
	WebDriver driver;
	
	
	public cucumberpages(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	
	public WebElement getUserId() {
		
		WebElement userid = driver.findElement(By.id("user-name"));
		
		return userid;
		
		
		
	}
	
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.id("password"));
		
		return password;
		
	}
	
	public WebElement getloginButton() {
		
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		
		return loginbutton;
		
	}
	
	
	public WebElement getwrongUserId() {
		
		WebElement wronguserid = driver.findElement(By.id("user-name"));
		
		return wronguserid;
		
		
	}
	
      public WebElement getwrongPassword() {
		
		WebElement wrongpassword = driver.findElement(By.id("password"));
		
		return wrongpassword;
		
		
	}
      
      
      
      public WebElement getfirstName() {
    	  
    	  WebElement firstname = driver.findElement(By.id("usernamereg-firstName"));
    	  
    	  return firstname;
    	  
    	  
    	  
      }
	
	
	public WebElement getlastName() {
		
		WebElement lastname = driver.findElement(By.id("usernamereg-lastName"));
		
		return lastname;
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
