package TestScripts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.home_amazon_page;
public class TestBase 
{
	public WebDriver driver1;
	public ExtentReports report;
	
	
	@BeforeSuite
	public void SetUpSuite()
	{
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/Report1.html"));
		report=new ExtentReports();
		report.attachReporter(extent);
	}
	
	
	@BeforeTest
	public void Setup() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver1.get("https://www.amazon.in/");	
		
		Thread.sleep(5000);
		System.out.println("Launched URL");
		
	}
	
	@AfterTest
	public void Teardown()
	{
		driver1.quit();
	}
	
	@AfterMethod
	public void TeardownAfterMethod()
	{
		report.flush();
	}
		
}
