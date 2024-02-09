package Starting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) throws InterruptedException 
	{
		//path of driver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Open Browser
		WebDriver driver = new ChromeDriver();
		//set URL
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		//close/Quit Browser
		driver.close();
		driver.quit();
		
	}

}
