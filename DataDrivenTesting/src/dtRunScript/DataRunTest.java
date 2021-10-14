package dtRunScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dtpages.Datapages;
import dtpages.datapagesInventory;

public class DataRunTest {

	    WebDriver driver;
	    
	    Datapages dt;
	    
	    datapagesInventory di;
		
		
		@BeforeTest
		public void beforetest() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			dt = new Datapages(driver);
			
			di = new datapagesInventory(driver);
			
			driver.get("https://www.saucedemo.com/");
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
			
		}
		
		@BeforeMethod
		public void beforeeachtest() {
			
			driver.navigate().to("https://www.saucedemo.com/");
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
		}
		
		@Parameters({"username","password","expectedurl"})
		@Test(priority=0)
		public void validatingpositivedata(String username,String password,String expectedurl) {
			
			dt.getFirstName().sendKeys(username);
			
			
			dt.getPassword().sendKeys(password);
			
			dt.getLoginButton().click();
			
			//String expectedurl = "https://www.saucedemo.com/";
			
			String actualurl = driver.getCurrentUrl();
			
			Assert.assertEquals(actualurl, expectedurl);
					
					
			
			
		}
		
		
		//@Test(priority=1)
		//public void validatingnegativedata() {
			
			
			//di.getUserName2().sendKeys("locked_out_user");
			
			
			//di.getPassword2().sendKeys("secret_sauce");
			
			
			//di.getLoginButton2().click();
			
           // String expectedurl = "https://www.saucedemo.com/inventory.html";
			
			//String actualurl = driver.getCurrentUrl();
			
			//Assert.assertEquals(actualurl, expectedurl);
			
			
				
				
				
				
				
			//}
			
			
			
			
		
		
		
		@AfterTest
		public void aftertest() {
			
			
			
			
		}

	}


