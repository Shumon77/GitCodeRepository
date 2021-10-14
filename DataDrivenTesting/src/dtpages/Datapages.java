package dtpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Datapages {
	
	WebDriver driver;
	
	public Datapages(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	
	public WebElement getFirstName() {
		
		WebElement firstname = driver.findElement(By.id("user-name"));
		
		return firstname;
		
		
		
	}
	
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.id("password"));
		
		return password;
		
		
	}
	
	
	public WebElement getLoginButton() {
		
		WebElement loginbutton = driver.findElement(By.id("login-button"));
		
		return loginbutton;
		
		
	}
	
	
	
	
	
	
	

}
