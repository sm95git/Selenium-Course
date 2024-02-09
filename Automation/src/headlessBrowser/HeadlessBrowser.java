package headlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		System.out.println(driver.getTitle());
				
		
	}

}
