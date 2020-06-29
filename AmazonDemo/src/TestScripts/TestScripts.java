package TestScripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import Pages.home_amazon_page;
import TestScripts.TestBase;


public class TestScripts extends TestBase

{	public ExtentTest log;
	
	@Test
	public void TC_01_LaunchAmazonAndValidateLogo() 
	{
		try 
		{
			log=report.createTest("TC_01_LaunchAmazonAndValidateLogo");
			home_amazon_page homepage = new home_amazon_page(driver1);
			log.info("Validating first testcase");
			homepage.ValidateAmazonLogo();
			log.pass("Pass");
			
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
