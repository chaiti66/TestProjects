package Pages;
import Pages.commonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home_amazon_page
{
	public WebDriver driver1;
	public home_amazon_page(WebDriver driver)
	{
 		this.driver1=driver;
	}
 	
 	//commonUtilities commonutils = new commonUtilities(driver1);
	By AmazonLogo = By.xpath("//a[@class='nav-logo-link']");
	By SearchTextBox =By.xpath("//input[@id='twotabsearchtextbox']");
	By BookTitle = By.xpath("//span[contains(.,'God of Small Things: Booker Prize Winner 1997- English') and @dir='auto']");
	By searchicon = By.xpath("//input[@type='submit']");
	public void ValidateAmazonLogo()
	{
		if(driver1.findElement(AmazonLogo).isDisplayed())
		
		{
			System.out.println("Logo displayed");
		}
		else
		{
			System.out.println("Logo not displayed");
		}
		
	}
	
	public void EnterTextInSearchAndFind()
	{
		commonUtilities commonutils = new commonUtilities(driver1);
		
		if(driver1.findElement(AmazonLogo).isDisplayed())
		{
			driver1.findElement(SearchTextBox).sendKeys("Arundhati Roy");
			driver1.findElement(searchicon).click();
			//commonutils.PressEnter();
			//System.out.println("enter pressed");
			commonutils.waitForSometime();
			
			if(driver1.findElement(BookTitle).isDisplayed())
			{
				System.out.println("Search successful");
			}
			else
			{
				System.out.println("Search failed");
			}
		}
		else
		{
			System.out.println("Logo not displayed");
		}
		
	}
	
	
	
	

}
