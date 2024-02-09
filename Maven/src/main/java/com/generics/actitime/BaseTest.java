package com.generics.actitime;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;

import com.pom.actitime.HomePage;
import com.pom.actitime.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
//import pomClass.HomePage;
	//import pomClass.LoginPage;

	public class BaseTest implements AutoConstant
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
			//System.setProperty(chrome_key, chrome_value);
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get(url);
			
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



