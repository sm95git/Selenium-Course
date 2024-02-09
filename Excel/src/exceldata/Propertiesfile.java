package exceldata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Propertiesfile 
{
	@Test
	public void properties() throws IOException
	{
		FileInputStream fis = new FileInputStream("./properties/config.properties");
	
		Properties prop = new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(prop.getProperty("usernamelocator"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("passwordlocator"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("loginlocator"))).click();
		
		
		
		
		
	}

}
