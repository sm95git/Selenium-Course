package highlightElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.id("email"));
		WebElement ell =driver.findElement(By.name("pass"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border:50px black')", ele);
		ele.sendKeys("sm");
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:50px red')", ell);
		Thread.sleep(3000);
		ell.sendKeys("sss");
		
	}

}
