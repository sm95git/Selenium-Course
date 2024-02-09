package mouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		
		Actions act = new Actions(driver);
		// Left click
		//act.click(ele).perform();
		
		// Double click
		//act.doubleClick(ele).perform();

		// Right click
		//act.contextClick(ele).perform();
		
		// click and hold()	
		act.clickAndHold(ele).perform();
		Thread.sleep(3000);
		act.release(ele).perform();
		
		
		
	}

}
