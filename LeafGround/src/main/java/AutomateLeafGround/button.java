package AutomateLeafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class button {
	
	WebDriver driver;

	@Test()
	public void button1()
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
