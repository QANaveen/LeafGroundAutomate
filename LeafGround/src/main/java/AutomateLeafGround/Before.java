package AutomateLeafGround;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class Before {
	
	WebDriver driver;
	@BeforeClass
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32new\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
	}

}
