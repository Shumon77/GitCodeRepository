package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		
		//WebDriver driver1 = new ChromeDriver();
		
		
		driver.get("https://login.yahoo.com/?.intl=us");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("login-username")).sendKeys("syed.shumon77@icloud.com");
		
		driver.findElement(By.id("login-signin")).click();
		
		String x = driver.getWindowHandle();
		
		driver.switchTo();
		
		//driver1.get("https://www.google.com/");
		
		//String url = driver.getCurrentUrl();
		
		//String title = driver.getTitle();
		
		
		//System.out.println(url);
		
		//System.out.println(title);
		
		
		
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("Sign up for Twitter")).click();
		
		
		//url = driver.getCurrentUrl();
		
		//title = driver.getTitle();
		
		//System.out.println(url);
		
		//System.out.println(title);
		
		

	}

}
