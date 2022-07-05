package testpackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class prioritytest {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void beforetest() {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get("https://login.yahoo.com/account/create?.lang=en-IN&src=help&activity=ybar-signin&pspid=986299010&add=1&done=https%3A%2F%2Fin.help.yahoo.com%2Fkb%2FSLN2056.html&specId=yidregsimplified");
		
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		
		
		
	}
	
	@Test(priority=0)
	public void test() {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Lizy");
		
		
		
		}
	
	
	@Test(priority=1)
	public void email() {
		
		driver.findElement(By.xpath("//input[@id='usernamereg-userId']")).sendKeys("tom@icloud.com");
		
		
		
		
		
		
		}
	
	
	@Test(priority=2)
	public void password() {
		
		
		driver.findElement(By.id("usernamereg-password")).sendKeys("Ohgdhdhgh");
		
		
		
		
		
		}
	
	
	@Test(priority=3)
	public void dateofbirth() {
		
		WebElement dateofbit = driver.findElement(By.id("usernamereg-birthYear"));
		
		    dateofbit.isDisplayed();
		
	
		
		
	   SoftAssert softAssert = new SoftAssert();
		
	   
		
		
		
		
	}
	
	
	
	@Test(priority=4)
	public void loginBtn() {
		
		driver.findElement(By.id("usernamereg-birthYea")).sendKeys("476476476");
		
		
	
	}
	
	
	
	@AfterTest
	public void aftertest() {
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
