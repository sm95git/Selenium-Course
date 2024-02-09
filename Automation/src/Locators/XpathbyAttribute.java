package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// xpath by attribute		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sm");
		
		// xpath by Text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		
		// xpath by group index
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		// xpath  by contains
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("sdd");
		
		
		
	}

}
