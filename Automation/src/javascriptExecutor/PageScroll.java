package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) throws InterruptedException {
		// page scrolling by js
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=0; i<=3; i++)
		{
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,500)");
		}
		
		for(int i=0; i<=3; i++)
		{
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-500)");
			
		}
		
		
	}

}
