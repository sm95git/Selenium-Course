package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdName {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// by id
		driver.findElement(By.id("email")).sendKeys("sm");
		// by name
		driver.findElement(By.name("pass")).sendKeys("123");
		// by link text
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//by partial linkText
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		// getText() of web element
		//System.out.println(driver.findElement(By.partialLinkText("Forgot")).getText());
		
		// by Class name
		driver.findElement(By.className("inputtext")).sendKeys("asddf");
		
		
		
	}

}
