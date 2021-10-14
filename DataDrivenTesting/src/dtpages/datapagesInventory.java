package dtpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class datapagesInventory {
	
	WebDriver driver;
	
	public datapagesInventory(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	
	public WebElement getUserName2() {
		
		WebElement username = driver.findElement(By.id("user-name"));
		
		return username;
		
		
	}
	
        public WebElement getPassword2() {
		
		WebElement password = driver.findElement(By.id("password"));
		
		return password;
		
		
	}
        
        public WebElement getLoginButton2() {
    		
    		WebElement loginbutton = driver.findElement(By.id("login-button"));
    		
    		return loginbutton;
    		
    		
    	}

}
