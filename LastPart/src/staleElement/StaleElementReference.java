package staleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReference {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[.='Men']"));
		men.click();
		Thread.sleep(5000);
	//	System.out.println(men.getText());
		
	//	WebElement newman = driver.findElement(By.xpath("//a[.='Men']"));
		//System.out.println(newman.getText());
		
		try {
			men.click();
		}
		catch (StaleElementReferenceException e) 
		{
			men = driver.findElement(By.xpath("//a[.='Men']"));
			men.click();
			
		}
		
		
	}
	

}
