package staleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementByFB {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
 		WebElement link = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		link.click();
		
		WebElement newlink = driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		System.out.println(newlink.getText());
		
	}

}
