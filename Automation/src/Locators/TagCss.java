package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagCss {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// by tagName
		//driver.findElement(By.tagName("input")).sendKeys("sm");
		
		// cssSelector
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("sss");
		
	}

}
