package seleniumBasicCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbutton {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com/");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		
		//driver.findElement(By.id("ybar-sbq")).sendKeys("sign in");
		
		
		//Thread.sleep(1000);
		
		//driver.findElement(By.id("ybar-search")).click();
		
		
		WebElement entertainment = driver.findElement(By.linkText("Entertainment"));
		
		entertainment.click();
		
		
		

	}

}
