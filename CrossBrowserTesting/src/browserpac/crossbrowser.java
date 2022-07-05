package browserpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class crossbrowser {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		
		System.setProperty("webdriver.edgedriver.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\edgedriver_win64\\msedgedriver.exe");
		
		
		driver = new EdgeDriver();
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\syeds\\OneDrive\\Desktop\\Libraries\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		//driver = new ChromeDriver();
		
		
		

	}

}
