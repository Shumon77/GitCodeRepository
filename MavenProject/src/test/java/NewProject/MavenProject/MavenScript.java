package NewProject.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenScript {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
           
           driver = new ChromeDriver();
           
           
           driver.get("https://twitter.com/i/flow/login");
           
           
           driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           
           driver.manage().deleteAllCookies();
           
           driver.findElement(By.name("text")).sendKeys("syed.shumon77@icloud.com");
           
           driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[6]/div/span/span")).click();

	}

}
