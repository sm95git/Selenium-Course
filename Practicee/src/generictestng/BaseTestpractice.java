package generictestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pom.Homepage;
import pom.LoginPage;

public class BaseTestpractice 
{
	public WebDriver driver; 
	
	@BeforeSuite
	public void executionstart()
	{
		System.out.println("execn started");
	}
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		
	}
	
	@BeforeMethod
	public void login()
	{
		LoginPage l= new LoginPage(driver);
		l.LoginApp();
	}
	
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		Homepage h = new Homepage(driver);
		h.lgoutapp();
	}

	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
	@AfterSuite
	public void complete()
	{
		System.out.println("exctn completed");
	}
 }
