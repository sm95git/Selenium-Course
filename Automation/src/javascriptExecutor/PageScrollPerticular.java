package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollPerticular {

	public static void main(String[] args) {
		// page scroll to a particular point
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
 		
		WebElement wiki = driver.findElement(By.xpath("//span[.='Wiktionary']"));
		
 		int x = wiki.getLocation().getX();
 		int y = wiki.getLocation().getY();
 		
 		JavascriptExecutor js = (JavascriptExecutor)driver;
 		js.executeScript("window.scrollBy("+x+","+y+")");
 		
	}

}
