package parametarization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class crossbrowsertesting {
	
	
	WebDriver driver;
	
	@BeforeTest
	public void beforettest() {
		
		System.setProperty("webdriver,msedgedriver.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\msedgedriver.exe");
		
		
		driver = new EdgeDriver();
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		
		
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

}
