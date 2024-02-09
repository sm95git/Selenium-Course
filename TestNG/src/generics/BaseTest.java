package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pomClass.HomePage;
import pomClass.LoginPage;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeSuite
	public void executionstart()
	{
		System.out.println("execution started");
	}
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		
	}
	
	@BeforeMethod
	public void logintoapp()
	{
		LoginPage lg =new LoginPage(driver);
		lg.login();
	}
	
	@AfterMethod
	public void logoutfromapp() throws InterruptedException
	{
		HomePage hmm = new HomePage(driver);
		hmm.logout();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
		
	}

	@AfterSuite
	public void executioncomplete()
	{
		System.out.println("execution completed");
	}
	
}
