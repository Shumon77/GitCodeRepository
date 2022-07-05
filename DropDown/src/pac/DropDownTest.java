package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		
		//Setting up properties
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://login.yahoo.com/account/create");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		
		WebElement firstNameTextBox = driver.findElement(By.id("usernamereg-firstName"));
		WebElement laststNameTextBox = driver.findElement(By.id("usernamereg-lastName"));
		WebElement emailTextBox = driver.findElement(By.id("usernamereg-yid"));
		WebElement passWordTextBox = driver.findElement(By.id("usernamereg-password"));
		WebElement mobileTextBox = driver.findElement(By.id("usernamereg-phone"));
		WebElement monthDropd = driver.findElement(By.id("usernamereg-month"));
		WebElement dayDropd = driver.findElement(By.id("usernamereg-day"));
		WebElement yearDropd = driver.findElement(By.id("usernamereg-year"));
		
		
		//DropDown
		
		WebElement countryCodeDropd = driver.findElement(By.name("shortCountryCode"));
		
		
		//Submit button
		
		WebElement submitButton = driver.findElement(By.name("shortCountryCode"));
		
		//entering value to the form
		
		boolean firstName = firstNameTextBox.isEnabled();
		System.out.println("firstNameTextBox");
		
		firstNameTextBox.sendKeys("Tom");
		
		laststNameTextBox.sendKeys("John");
		
		emailTextBox.sendKeys("tom@icloud.com");
		
		
		
		Select ddcc = new Select(countryCodeDropd);
		
		ddcc.selectByIndex(10);   //Index start with zero.
		
		mobileTextBox.sendKeys("732727727");
		
		
		
		Select ddmonth = new Select(monthDropd);
		
		ddmonth.selectByVisibleText("August");
		
		
		
		dayDropd.sendKeys("11");
		
		
		yearDropd.sendKeys("1998");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
