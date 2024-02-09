package characterSequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharSequense {

	public static void main(String[] args) {
		
		// different way of entering character sequence
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username= driver.findElement(By.id("email"));
		
		StringBuffer b = new StringBuffer();
		b.append("si")
		.append("ba")
		.append(" ")
		.append("si")
		.append("sh");
		
		username.sendKeys(b);
		
		
		WebElement password = driver.findElement(By.id("pass"));
		
		StringBuilder f = new StringBuilder();
		f.append("g")
		.append("u")
		.append("  ")
		.append("d")
		.append("d")
		.append("u");
		
		password.sendKeys(f);
		
		
		
	}

}
