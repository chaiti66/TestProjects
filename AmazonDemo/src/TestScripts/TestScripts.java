package TestScripts;

import org.testng.annotations.Test;

import Pages.home_amazon_page;
import TestScripts.TestBase;


public class TestScripts extends TestBase

{	
	
	
	@Test
	public void TC_01_LaunchAmaszonAndValidateLogo() 
	{
		try 
		{
			log = report.createTest("AmazonLogoValidate");
			home_amazon_page homepage = new home_amazon_page(driver1);
			homepage.ValidateAmazonLogo();
			log.pass("Test Passed");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	//@Test
	public void TC_02_ValidateSearch() 
	{
		try 
		{
			home_amazon_page homepage = new home_amazon_page(driver1);
			homepage.EnterTextInSearchAndFind();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
