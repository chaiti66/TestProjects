package Pages;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class commonUtilities 

{
	 WebDriver driver1;
	
	// Constructor
    // This constructor is invoked when object of this page is created in test script classes
	public commonUtilities(WebDriver driver)
	{
 		// "this" keyword is used here to distinguish global and local variable "driver"
        //gets driver as parameter from test scripts classes and assigns to the driver instance in this class
 		this.driver1=driver;
	}
	
	public void waitForSometime()
	{
		try 
		{
			Thread.sleep(5000);
			System.out.println("Wait");
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void Back()
	{
		driver1.navigate().back();
	}
	
	public void PressEnter()
	{
		Actions builder = new Actions(driver1);
		builder.sendKeys(Keys.ENTER);
		System.out.println("Enter pressed");
		
	}
	
	public void Doubleclick(WebElement by)
	{
		Actions builder = new Actions(driver1);
		builder.doubleClick(by);
		
	}
	
	
	
	
	
	
}
