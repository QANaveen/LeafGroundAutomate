package AutomateLeafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LeafGround {
	WebDriver driver;
	
	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32new\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/");
		
	}

	@Test(priority = 0)
	public void editbutton()
	{

		WebElement editbutton = driver.findElement(By.xpath("//a[@href='pages/Edit.html']"));
		editbutton.click();
		WebElement mailbox = driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"email\" ]"));
		mailbox.sendKeys("Naveen@abc.com");
		WebElement append = driver.findElement(By.xpath("//input[@type='text' and @value='Append ']"));
		append.sendKeys("Hello world");
		WebElement gettext = driver.findElement(By.xpath("//input[@type='text' and @value='TestLeaf']"));
		String text = gettext.getAttribute("value");
		System.out.println(text);
		WebElement clear = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clear.clear();
		WebElement check  = driver.findElement(By.xpath("//input[@type='text' and @disabled = 'true']"));
		System.out.println(check.isEnabled());
	}
	
	@Test(priority = 1)
	public void button()
	{
		WebElement button = driver.findElement(By.xpath("//img[@src='images/button.png']"));
		button.click();
		WebElement homepage = driver.findElement(By.xpath("//button[@onclick=\"window.location='../home.html';\"]"));
		homepage.click();
		driver.navigate().back();
		WebElement getlocation = driver.findElement(By.xpath("//button[@id=\"position\"]"));
		Dimension area = getlocation.getSize();
		int height=area.getHeight();
		int width = area.getWidth();
		System.out.println("height is "+ height);
		System.out.println("width is "+ width);
		Point point = getlocation.getLocation();
		int xaxis = point.getX();
		int yaxis = point.getY();
		System.out.println("xaxis is " +xaxis);
		System.out.println("yaxis is " +yaxis);
		WebElement getcolor = driver.findElement(By.xpath("//button[@id=\"color\"]"));
		System.out.println(getcolor.getCssValue("color"));
			
	}
}
