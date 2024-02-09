package specialLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;

public class SpecialLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(new ByAll(By.id("email"),By.name("sou"),By.xpath("mya")));
		username.sendKeys("sm");
		
		//WebElement un = driver.findElement(new ByIdOrName("email"));
		//un.sendKeys("sm");
		
	}

}
