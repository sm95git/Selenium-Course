package refreshWebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageRefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	
		// different ways of refreshing webpage
	//	driver.navigate().refresh();
		//driver.navigate().to(driver.getCurrentUrl());
		driver.get(driver.getCurrentUrl());
		
		
		
		
		
	}

}
