package hoptionindropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Optionindropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://twitter.com/i/flow/signup");
			
		
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		WebElement signup = driver.findElement(By.xpath("//span[contains(text(),'Sign up with phone or email')]"));
		
		signup.click();
		
		
		int size = driver.findElements(By.xpath("//*[@id='SELECTOR_1']/option")).size();
		
		System.out.println("Size is :"+size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
