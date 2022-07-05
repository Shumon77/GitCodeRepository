

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
	      
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	    //Current window handle - before click
		
		
		String parentHandle = driver.getWindowHandle();
			
		System.out.println("parent Window - " + parentHandle);
		
		driver.findElement(By.linkText("Sign in")).click();
		
		Set<String>  handles = driver.getWindowHandles();
		
         for (String handle : handles) {
			
		
			
			System.out.println(handle);
			
			
			if(!handle.equals(parentHandle)) {
			
				Thread.sleep(2000);
				
			//driver.switchTo().window(handle);
			
			
			
			driver.findElement(By.id("email")).sendKeys("Tom@.com");
			
			driver.findElement(By.id("email_create")).sendKeys("tom.@icloud.com");
			
			
			driver.navigate().back();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}}
